package com.park.service;

import com.park.Repository.PostsRepository;
import com.park.dto.PostsMainResponseDto;
import com.park.dto.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PostsSerivce {
    private PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto dto){
        return postsRepository.save(dto.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public List<PostsMainResponseDto> findAllDesc()
    {
        return postsRepository.findAlldesc()
                .map(PostsMainResponseDto::new)
                .collect(Collectors.toList());
    }
}
