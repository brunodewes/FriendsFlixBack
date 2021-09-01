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


        Movie topRated1 = new Movie();
        topRated1.setTitle("The Godfather (1972)");
        topRated1.setImageUrl(movieImage("w600_and_h900_bestv2/3bhkrj58Vtu7enYsRolD1fZdja1.jpg"));
        topRated1.setNumRating(0);
        topRated1.setRating(0.0f);
        topRated1.setCategory("Top Rated");

        Movie topRated2 = new Movie();
        topRated2.setTitle("Your Name. (2016)");
        topRated2.setImageUrl(movieImage("w600_and_h900_bestv2/q719jXXEzOoYaps6babgKnONONX.jpg"));
        topRated2.setNumRating(0);
        topRated2.setRating(0.0f);
        topRated2.setCategory("Top Rated");

        Movie topRated3 = new Movie();
        topRated3.setTitle("Parasite (2019)");
        topRated3.setImageUrl(movieImage("w600_and_h900_bestv2/7IiTTgloJzvGI1TAYymCfbfl3vT.jpg"));
        topRated3.setNumRating(0);
        topRated3.setRating(0.0f);
        topRated3.setCategory("Top Rated");

        Movie topRated4 = new Movie();
        topRated4.setTitle("My Hero Academia: Heroes Rising (2019)");
        topRated4.setImageUrl(movieImage("w600_and_h900_bestv2/zGVbrulkupqpbwgiNedkJPyQum4.jpg"));
        topRated4.setNumRating(0);
        topRated4.setRating(0.0f);
        topRated4.setCategory("Top Rated");

        Movie topRated5 = new Movie();
        topRated5.setTitle("The Dark Knight (2008)");
        topRated5.setImageUrl(movieImage("w600_and_h900_bestv2/qJ2tW6WMUDux911r6m7haRef0WH.jpg"));
        topRated5.setNumRating(0);
        topRated5.setRating(0.0f);
        topRated5.setCategory("Top Rated");

        Movie topRated6 = new Movie();
        topRated6.setTitle("The Lord of the Rings: The Return of the King (2003)");
        topRated6.setImageUrl(movieImage("w600_and_h900_bestv2/rCzpDGLbOoPwLjy3OAm5NUPOTrC.jpg"));
        topRated6.setNumRating(0);
        topRated6.setRating(0.0f);
        topRated6.setCategory("Top Rated");

        Movie topRated7 = new Movie();
        topRated7.setTitle("Forrest Gump (1994)");
        topRated7.setImageUrl(movieImage("w600_and_h900_bestv2/h5J4W4veyxMXDMjeNxZI46TsHOb.jpg"));
        topRated7.setNumRating(0);
        topRated7.setRating(0.0f);
        topRated7.setCategory("Top Rated");


        Movie acao1 = new Movie();
        acao1.setTitle("The Suicide Squad");
        acao1.setImageUrl(movieImage("w600_and_h900_bestv2/iXbWpCkIauBMStSTUT9v4GXvdgH.jpg"));
        acao1.setNumRating(0);
        acao1.setRating(0.0f);
        acao1.setCategory("Action");

        Movie acao2 = new Movie();
        acao2.setTitle("Sweet Girl (2021)");
        acao2.setImageUrl(movieImage("w600_and_h900_bestv2/cP7odDzzFBD9ycxj2laTeFWGLjD.jpg"));
        acao2.setNumRating(0);
        acao2.setRating(0.0f);
        acao2.setCategory("Action");

        Movie acao3 = new Movie();
        acao3.setTitle("Jungle Cruise (2021)");
        acao3.setImageUrl(movieImage("w600_and_h900_bestv2/9dKCd55IuTT5QRs989m9Qlb7d2B.jpg"));
        acao3.setNumRating(0);
        acao3.setRating(0.0f);
        acao3.setCategory("Action");

        Movie acao4 = new Movie();
        acao4.setTitle("Black Widow (2021)");
        acao4.setImageUrl(movieImage("w600_and_h900_bestv2/qAZ0pzat24kLdO3o8ejmbLxyOac.jpg"));
        acao4.setNumRating(0);
        acao4.setRating(0.0f);
        acao4.setCategory("Action");

        Movie acao5 = new Movie();
        acao5.setTitle("Narco Sub (2021)");
        acao5.setImageUrl(movieImage("w600_and_h900_bestv2/7p0O4mKYLIhU2E5Zcq9Z3vOZ4e9.jpg"));
        acao5.setNumRating(0);
        acao5.setRating(0.0f);
        acao5.setCategory("Action");

        Movie acao6 = new Movie();
        acao6.setTitle("Free Guy (2021)");
        acao6.setImageUrl(movieImage("w600_and_h900_bestv2/hEqw9swA8gFJuNjgWYEypwZfkZg.jpg"));
        acao6.setNumRating(0);
        acao6.setRating(0.0f);
        acao6.setCategory("Action");

        Movie acao7 = new Movie();
        acao7.setTitle("Beckett (2021)");
        acao7.setImageUrl(movieImage("w600_and_h900_bestv2/fBJducGBcmrcIOQdhm4BUBNDiMu.jpg"));
        acao7.setNumRating(0);
        acao7.setRating(0.0f);
        acao7.setCategory("Action");


        Movie popular1 = new Movie();
        new10.setTitle("The Suicide Squad");
        new10.setImageUrl(movieImage("w220_and_h330_face/iXbWpCkIauBMStSTUT9v4GXvdgH.jpg"));
        new10.setNumRating(0);
        new10.setRating(0.0f);
        new10.setCategory("Popular");

        Movie popular2 = new Movie();
        new10.setTitle("Sweet Girl");
        new10.setImageUrl(movieImage("w220_and_h330_face/cP7odDzzFBD9ycxj2laTeFWGLjD.jpg"));
        new10.setNumRating(0);
        new10.setRating(0.0f);
        new10.setCategory("Popular");

        Movie popular3 = new Movie();
        new10.setTitle("Jungle Cruise");
        new10.setImageUrl(movieImage("w220_and_h330_face/9dKCd55IuTT5QRs989m9Qlb7d2B.jpg"));
        new10.setNumRating(0);
        new10.setRating(0.0f);
        new10.setCategory("Popular");

        Movie popular4 = new Movie();
        new10.setTitle("PAW Patrol: The Movie");
        new10.setImageUrl(movieImage("w220_and_h330_face/ic0intvXZSfBlYPIvWXpU1ivUCO.jpg"));
        new10.setNumRating(0);
        new10.setRating(0.0f);
        new10.setCategory("Popular");

        Movie popular5 = new Movie();
        new10.setTitle("Eggs Run");
        new10.setImageUrl(movieImage("w220_and_h330_face/wrlQnKHLCBheXMNWotyr5cVDqNM.jpg"));
        new10.setNumRating(0);
        new10.setRating(0.0f);
        new10.setCategory("Popular");

        Movie popular6 = new Movie();
        new10.setTitle("Black Widow");
        new10.setImageUrl(movieImage("w220_and_h330_face/qAZ0pzat24kLdO3o8ejmbLxyOac.jpg"));
        new10.setNumRating(0);
        new10.setRating(0.0f);
        new10.setCategory("Popular");

        Movie popular7 = new Movie();
        new10.setTitle("Space Jam: A New Legacy");
        new10.setImageUrl(movieImage("w220_and_h330_face/5bFK5d3mVTAvBCXi5NPWH0tYjKl.jpg"));
        new10.setNumRating(0);
        new10.setRating(0.0f);
        new10.setCategory("Popular");


        Movie upcoming1 = new Movie();
        new10.setTitle("Venom: Let There Be Carnage");
        new10.setImageUrl(movieImage("w220_and_h330_face/jNd6tx7FL2h7wtZgLUsLvzD0kFN.jpg"));
        new10.setNumRating(0);
        new10.setRating(0.0f);
        new10.setCategory("Upcoming");

        Movie upcoming2 = new Movie();
        new10.setTitle("Malignant");
        new10.setImageUrl(movieImage("w220_and_h330_face/1N5e56325vwih8IeJ29k9FZf8p8.jpg"));
        new10.setNumRating(0);
        new10.setRating(0.0f);
        new10.setCategory("Upcoming");

        Movie upcoming3 = new Movie();
        new10.setTitle("Cry Macho");
        new10.setImageUrl(movieImage("w220_and_h330_face/nMFWfwer3IYTALLEiNno4SaVMbE.jpg"));
        new10.setNumRating(0);
        new10.setRating(0.0f);
        new10.setCategory("Upcoming");

        Movie upcoming4 = new Movie();
        new10.setTitle("Copshop");
        new10.setImageUrl(movieImage("w220_and_h330_face/9Se3AIepFRZ4VUaaDosADs8WMX5.jpg"));
        new10.setNumRating(0);
        new10.setRating(0.0f);
        new10.setCategory("Upcoming");

        Movie upcoming5 = new Movie();
        new10.setTitle("The Card Counter");
        new10.setImageUrl(movieImage("w220_and_h330_face/60AQOrByV9vDCqy6nt4eOroRild.jpg"));
        new10.setNumRating(0);
        new10.setRating(0.0f);
        new10.setCategory("Upcoming");

        Movie upcoming6 = new Movie();
        new10.setTitle("Dear Evan Hansen");
        new10.setImageUrl(movieImage("w220_and_h330_face/11sowWt2GlQj6lGG4foLldXMyzF.jpg"));
        new10.setNumRating(0);
        new10.setRating(0.0f);
        new10.setCategory("Upcoming");

        Movie upcoming7 = new Movie();
        new10.setTitle("Time Is Up");
        new10.setImageUrl(movieImage("w220_and_h330_face/inNOfgjhnPZkJfqpLS1mk4GbzMc.jpg"));
        new10.setNumRating(0);
        new10.setRating(0.0f);
        new10.setCategory("Upcoming");


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

        movieRepository.save(topRated1);
        movieRepository.save(topRated2);
        movieRepository.save(topRated3);
        movieRepository.save(topRated4);
        movieRepository.save(topRated5);
        movieRepository.save(topRated6);
        movieRepository.save(topRated7);

        movieRepository.save(acao1);
        movieRepository.save(acao2);
        movieRepository.save(acao3);
        movieRepository.save(acao4);
        movieRepository.save(acao5);
        movieRepository.save(acao6);
        movieRepository.save(acao7);

        movieRepository.save(popular1);
        movieRepository.save(popular2);
        movieRepository.save(popular3);
        movieRepository.save(popular4);
        movieRepository.save(popular5);
        movieRepository.save(popular6);
        movieRepository.save(popular7);

        movieRepository.save(upcoming1);
        movieRepository.save(upcoming2);
        movieRepository.save(upcoming3);
        movieRepository.save(upcoming4);
        movieRepository.save(upcoming5);
        movieRepository.save(upcoming6);
        movieRepository.save(upcoming7);
    }

    private String movieImage(String url) {
        return "https://image.tmdb.org/t/p/" + url;
    }
}
