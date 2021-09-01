package com.friendsflix.repositories;

import com.friendsflix.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
    List<Movie> getMoviesByCategory(String category);

    @Query("SELECT m FROM movie m WHERE m.id IN (SELECT mf.movieId FROM moviefavorite mf WHERE mf.userId = :userId)")
    List<Movie> getFavoriteMovies(@Param("userId") Integer userId);
}
