package com.friendsflix.repositories;

import com.friendsflix.entities.MovieFavorite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MovieFavoriteRepository extends JpaRepository<MovieFavorite, Integer> {
    @Query("SELECT mf FROM moviefavorite mf WHERE mf.userId = :userId AND mf.movieId = :movieId")
    MovieFavorite getMovieFavorityByIds(@Param("userId") Integer userId, @Param("movieId") Integer movieId);
}
