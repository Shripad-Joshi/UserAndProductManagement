package com.expo.managmentSystem.repository;

import com.expo.managmentSystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
