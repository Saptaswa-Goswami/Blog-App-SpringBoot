package com.saptaswa.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saptaswa.blog.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
