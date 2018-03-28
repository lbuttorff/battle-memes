package com.ist411.memes.daos;

import com.ist411.memes.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);
}