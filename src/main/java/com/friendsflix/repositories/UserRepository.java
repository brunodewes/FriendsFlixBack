package com.friendsflix.repositories;

import com.friendsflix.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u FROM user u WHERE username = :username AND password = :password")
    User getUsersByLogin(@Param("username") String username, @Param("password") String password);

    @Query("SELECT COUNT(*)>0 FROM user WHERE username = :username")
    Boolean hasUsername(@Param("username")String username);
}
