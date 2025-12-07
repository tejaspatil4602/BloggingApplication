package com.applicationBlogging.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.applicationBlogging.blog.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
