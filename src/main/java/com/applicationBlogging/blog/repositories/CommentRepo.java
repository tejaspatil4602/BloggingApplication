package com.applicationBlogging.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.applicationBlogging.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
