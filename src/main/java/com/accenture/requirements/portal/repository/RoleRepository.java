package com.accenture.requirements.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.requirements.portal.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
