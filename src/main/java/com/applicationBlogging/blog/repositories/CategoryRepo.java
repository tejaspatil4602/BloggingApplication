package com.applicationBlogging.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.applicationBlogging.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
