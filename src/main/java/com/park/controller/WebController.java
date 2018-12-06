package com.park.controller;

import com.park.service.PostsSerivce;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class WebController {
    private PostsSerivce postsSerivce;
    @GetMapping("/")
    public String Main(Model model)
    {
        model.addAttribute("posts",postsSerivce.findAllDesc());

        return "main";
    }
}
