package com.saptaswa.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saptaswa.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
