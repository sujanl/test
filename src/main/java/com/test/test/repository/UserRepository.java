package com.test.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test.model.User;

public interface UserRepository extends JpaRepository<User, Long> {


}
