package com.example.sweater.repos;

import com.example.sweater.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, Long> {
    //todo переделать username на userName
    User findByUsername(String username);

    User findByActivationCode(String code);


}