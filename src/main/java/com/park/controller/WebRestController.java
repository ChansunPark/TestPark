package com.park.controller;

import com.park.Repository.PostsRepository;
import com.park.dto.PostsSaveRequestDto;
import com.park.service.PostsSerivce;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsRepository postsRepository;
    //private PostsSerivce postsService;
    @RequestMapping("/Hello")
    public String index() {
        return "helloworld!";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto)
    {
      //  postsService.save(dto);
        postsRepository.save(dto.toEntity());
    }
}
