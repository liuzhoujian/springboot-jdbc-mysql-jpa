package com.lzj.springbootjpa.dao;

import com.lzj.springbootjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposity extends JpaRepository<User, Integer> {
}
