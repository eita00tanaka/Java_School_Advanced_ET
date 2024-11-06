package com.example.java_sample_pj.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.java_sample_pj.domain.model.user.User;

@Mapper
public interface UserMapper {

    List<User> findAll();
}
