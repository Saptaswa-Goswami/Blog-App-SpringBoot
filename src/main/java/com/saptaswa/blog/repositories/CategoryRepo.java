package com.saptaswa.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saptaswa.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
