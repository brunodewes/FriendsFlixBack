package com.friendsflix.repositories;

import com.friendsflix.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    List<Comment> getCommentsByMovieId(Integer movieId);
}
