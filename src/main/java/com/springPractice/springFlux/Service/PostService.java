package com.springPractice.springFlux.Service;

import org.springframework.stereotype.Service;

import com.springPractice.springFlux.Entity.PostEntity;
import com.springPractice.springFlux.Mapper.PostMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostMapper postMapper;

    public PostEntity getPostById(Long id) {
        return postMapper.findById(id);
    }
}
