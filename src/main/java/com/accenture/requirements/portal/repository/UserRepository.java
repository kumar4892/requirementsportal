package com.accenture.requirements.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.requirements.portal.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
