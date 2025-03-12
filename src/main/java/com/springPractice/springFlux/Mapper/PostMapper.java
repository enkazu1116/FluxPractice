package com.springPractice.springFlux.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.springPractice.springFlux.entity.PostEntity;

@Mapper
public interface PostMapper {
    PostEntity findById(Long id);
}
