package com.springPractice.springFlux.Mapper;

import com.springPractice.springFlux.Entity.PostEntity;

public interface PostMapper {
    PostEntity findById(Long id);
}
