package com.example.java_sample_pj.domain.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.java_sample_pj.domain.mapper.UserMapper;
import com.example.java_sample_pj.domain.model.user.User;

@Repository
// @RequiredArgsConstructor
public class UserRepository {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.findAll();
    }
}
