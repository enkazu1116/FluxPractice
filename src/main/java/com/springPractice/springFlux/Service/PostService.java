package com.springPractice.springFlux.service;

import org.springframework.stereotype.Service;

import com.springPractice.springFlux.entity.PostEntity;
import com.springPractice.springFlux.mapper.PostMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostMapper postMapper;

    public PostEntity getPostById(long id) {
        return postMapper.findById(id);
    }
}
