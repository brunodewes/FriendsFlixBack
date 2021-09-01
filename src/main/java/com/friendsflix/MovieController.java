package com.friendsflix;

import com.friendsflix.entities.Comment;
import com.friendsflix.entities.Movie;
import com.friendsflix.entities.MovieFavorite;
import com.friendsflix.entities.User;
import com.friendsflix.repositories.CommentRepository;
import com.friendsflix.repositories.MovieFavoriteRepository;
import com.friendsflix.repositories.MovieRepository;
import com.friendsflix.repositories.UserRepository;
import com.friendsflix.responses.LoginResponse;
import com.friendsflix.responses.MovieListResponse;
import com.friendsflix.responses.MovieResponse;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private MovieFavoriteRepository movieFavoriteRepository;

    @Autowired
    private CommentRepository commentRepository;

    @PostMapping("/login")
    @ResponseBody
    public ResponseEntity<?> login(
            @RequestParam(name = "username") String username,
            @RequestParam(name = "password") String password
    ) {
        User user = userRepository.getUsersByLogin(username, password);
        if (user == null) {
            return new ResponseEntity<>((LoginResponse) null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(new LoginResponse(user.getId()), HttpStatus.OK);
    }

    @PostMapping("/signup")
    @ResponseBody
    public ResponseEntity<?> signup(
            @RequestParam(name = "username") String username,
            @RequestParam(name = "password") String password,
            @RequestParam(name = "name") String name,
            @RequestParam(name = "age") Integer age
    ) {
        if (userRepository.hasUsername(username)) {
            return new ResponseEntity<>((LoginResponse) null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        User user = new User();
        user.setAge(age);
        user.setName(name);
        user.setPassword(password);
        user.setUsername(username);
        return new ResponseEntity<>(new LoginResponse(userRepository.save(user).getId()), HttpStatus.OK);
    }

    @PostMapping("/movie_list")
    @ResponseBody
    public ResponseEntity<?> movieList(
            @RequestParam(name = "category") String category
    ) {
        List<Movie> movies = movieRepository.getMoviesByCategory(category);
        List<MovieResponse> movieResponses = new ArrayList<>();
        for (Movie movie : movies) {
            movieResponses.add(new MovieResponse(movie.getId(), movie.getTitle(), movie.getImageUrl()));
        }
        MovieListResponse movieListResponse = new MovieListResponse(movieResponses);
        return new ResponseEntity<>(movieListResponse, HttpStatus.OK);
    }

    @PostMapping("/movie_detail")
    @ResponseBody
    public ResponseEntity<?> movieDetail(
            @RequestParam("movie_id") Integer movieId,
            @RequestParam("user_id") Integer userId
    ) {
        Movie movie = movieRepository.getById(movieId);
        MovieFavorite favorite = movieFavoriteRepository.getMovieFavorityByIds(userId, movieId);
        List<CommentResponse> comments = new ArrayList<>();

        for (Comment comment : commentRepository.getCommentsByMovieId(movieId)) {
            User user = userRepository.getById(comment.getUserId());
            comments.add(
                    new CommentResponse(
                            new UserResponse(
                                    user.getId(),
                                    user.getName(),
                                    user.getAge()
                            ),
                            comment.getComment(),
                            comment.getDate()
                    )
            );
        }

        Float rating = movie.getRating();
        if (movie.getNumRating() > 0) {
            rating /= movie.getNumRating();
            rating = Float.parseFloat(String.format("%.2f", rating));
        }

        MovieDetailResponse response = new MovieDetailResponse(
                movieId,
                movie.getTitle(),
                movie.getImageUrl(),
                favorite != null,
                rating,
                comments
        );

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/favorite")
    @ResponseBody
    public ResponseEntity<?> movieFavorite(
            @RequestParam("movie_id") Integer movieId,
            @RequestParam("user_id") Integer userId,
            @RequestParam("favorite") Boolean favorite
    ) {
        MovieFavorite movieFavorite = movieFavoriteRepository.getMovieFavorityByIds(userId, movieId);

        if (movieFavorite != null) {
            movieFavoriteRepository.delete(movieFavorite);
        } else {
            movieFavorite = new MovieFavorite();
            movieFavorite.setMovieId(movieId);
            movieFavorite.setUserId(userId);
            movieFavoriteRepository.save(movieFavorite);
        }

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/rating")
    @ResponseBody
    public ResponseEntity<?> movieRating(
            @RequestParam("movie_id") Integer movieId,
            @RequestParam("rating") Float rating
    ) {
        Movie movie = movieRepository.getById(movieId);
        movie.setRating(movie.getRating() + rating);
        movie.setNumRating(movie.getNumRating()+1);

        movieRepository.save(movie);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/make_comment")
    @ResponseBody
    public ResponseEntity<?> makeComment(
            @RequestParam("movie_id") Integer movieId,
            @RequestParam("user_id") Integer userId,
            @RequestParam("comment") String comment,
            @RequestParam("date") String date
    ) {
        Comment comments = new Comment();
        comments.setComment(comment);
        comments.setMovieId(movieId);
        comments.setUserId(userId);
        comments.setDate(date);

        commentRepository.save(comments);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("profile")
    @ResponseBody
    public ResponseEntity<?> profile(
            @RequestParam("user_id") Integer userId
    ) {
        List<Movie> favorites = movieRepository.getFavoriteMovies(userId);
        List<MovieResponse> movieResponses = new ArrayList<>();
        for (Movie movie : favorites) {
            movieResponses.add(new MovieResponse(movie.getId(), movie.getTitle(), movie.getImageUrl()));
        }
        User user = userRepository.getById(userId);
        return new ResponseEntity<>(new Profile(user.getName(), user.getAge(), new MovieListResponse(movieResponses)), HttpStatus.OK);
    }

    private class Profile {
        private String name;
        private Integer age;
        private MovieListResponse movies;

        public MovieListResponse getMovies() {
            return movies;
        }

        public void setMovies(MovieListResponse movies) {
            this.movies = movies;
        }

        public Profile(String name, Integer age, MovieListResponse movies) {
            this.name = name;
            this.age = age;
            this.movies = movies;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }

    private class MovieDetailResponse {
        private Integer id;
        private String title;
        private String image_url;
        private Boolean favorite;
        private Float rating;
        private List<CommentResponse> comments;

        public MovieDetailResponse(Integer id, String title, String image_url, Boolean favorite, Float rating,
                                   List<CommentResponse> comments) {
            this.id = id;
            this.title = title;
            this.image_url = image_url;
            this.favorite = favorite;
            this.rating = rating;
            this.comments = comments;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public Boolean getFavorite() {
            return favorite;
        }

        public void setFavorite(Boolean favorite) {
            this.favorite = favorite;
        }

        public Float getRating() {
            return rating;
        }

        public void setRating(Float rating) {
            this.rating = rating;
        }

        public List<CommentResponse> getComments() {
            return comments;
        }

        public void setComments(List<CommentResponse> comments) {
            this.comments = comments;
        }
    }

    private class CommentResponse {
        private UserResponse user;
        private String comment;
        private String date;

        public CommentResponse(UserResponse user, String comment, String date) {
            this.user = user;
            this.comment = comment;
            this.date = date;
        }

        public UserResponse getUser() {
            return user;
        }

        public void setUser(UserResponse user) {
            this.user = user;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }

    private class UserResponse {
        private Integer id;
        private String name;
        private Integer age;

        public UserResponse(Integer id, String name, Integer age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
