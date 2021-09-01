package com.friendsflix;

import com.friendsflix.entities.Movie;
import com.friendsflix.repositories.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MovieInitializer implements CommandLineRunner {

    private MovieRepository movieRepository;

    public MovieInitializer(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Movie new1 = new Movie();
        new1.setTitle("Infinite");
        new1.setImageUrl(movieImage("w600_and_h900_bestv2/niw2AKHz6XmwiRMLWaoyAOAti0G.jpg"));
        new1.setNumRating(0);
        new1.setRating(0.0f);
        new1.setCategory("New");

        Movie new2 = new Movie();
        new2.setTitle("Spiderman");
        new2.setImageUrl(movieImage("w600_and_h900_bestv2/4q2NNj4S5dG2RLF9CpXsej7yXl.jpg"));
        new2.setNumRating(0);
        new2.setRating(0.0f);
        new2.setCategory("New");

        Movie new3 = new Movie();
        new3.setTitle("DreamCatcher");
        new3.setImageUrl(movieImage("w600_and_h900_bestv2/3CF743g2BpC8r3mCVV9gSX2yQBj.jpg"));
        new3.setNumRating(0);
        new3.setRating(0.0f);
        new3.setCategory("New");

        Movie new4 = new Movie();
        new4.setTitle("Black Island");
        new4.setImageUrl(movieImage("w600_and_h900_bestv2/53jsv5TASLwOqsJNsUNp4RPPq2l.jpg"));
        new4.setNumRating(0);
        new4.setRating(0.0f);
        new4.setCategory("New");

        Movie new5 = new Movie();
        new5.setTitle("Breckett");
        new5.setImageUrl(movieImage("w600_and_h900_bestv2/fBJducGBcmrcIOQdhm4BUBNDiMu.jpg"));
        new5.setNumRating(0);
        new5.setRating(0.0f);
        new5.setCategory("New");

        Movie new6 = new Movie();
        new6.setTitle("The Tomorrow War");
        new6.setImageUrl(movieImage("w600_and_h900_bestv2/34nDCQZwaEvsy4CFO5hkGRFDCVU.jpg"));
        new6.setNumRating(0);
        new6.setRating(0.0f);
        new6.setCategory("New");

        Movie new7 = new Movie();
        new7.setTitle("Bartkowiak");
        new7.setImageUrl(movieImage("w600_and_h900_bestv2/kOVko9u2CSwpU8zGj14Pzei6Eco.jpg"));
        new7.setNumRating(0);
        new7.setRating(0.0f);
        new7.setCategory("New");

        Movie new8 = new Movie();
        new8.setTitle("S.O.Z: Soldiers or Zombies");
        new8.setImageUrl(movieImage("w600_and_h900_bestv2/arYdHX708nDq6oWNOSjw6NczWc5.jpg"));
        new8.setNumRating(0);
        new8.setRating(0.0f);
        new8.setCategory("New");

        Movie new9 = new Movie();
        new9.setTitle("American Horror Story");
        new9.setImageUrl(movieImage("w600_and_h900_bestv2/8NMACR0OE5bwC27rE15f8ManNBO.jpg"));
        new9.setNumRating(0);
        new9.setRating(0.0f);
        new9.setCategory("New");

        Movie new10 = new Movie();
        new10.setTitle("Suits");
        new10.setImageUrl(movieImage("w600_and_h900_bestv2/vQiryp6LioFxQThywxbC6TuoDjy.jpg"));
        new10.setNumRating(0);
        new10.setRating(0.0f);
        new10.setCategory("New");

        movieRepository.save(new1);
        movieRepository.save(new2);
        movieRepository.save(new3);
        movieRepository.save(new4);
        movieRepository.save(new5);
        movieRepository.save(new6);
        movieRepository.save(new7);
        movieRepository.save(new8);
        movieRepository.save(new9);
        movieRepository.save(new10);
    }

    private String movieImage(String url) {
        return "https://image.tmdb.org/t/p/" + url;
    }
}
