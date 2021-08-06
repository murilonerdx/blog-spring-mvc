package com.murilonerdx.blog.controller;

import com.murilonerdx.blog.model.Post;
import com.murilonerdx.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogController {

    @Autowired
    BlogService service;

    @RequestMapping(value="/posts", method = RequestMethod.GET)
    public ModelAndView getPosts(){
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = service.findAll();
        mv.addObject("posts",posts);
        return mv;
    }

    @RequestMapping(value="/posts/{id}", method = RequestMethod.GET)
    public ModelAndView getPostsDetails(@PathVariable Long id){
        ModelAndView mv = new ModelAndView("postDetails");
        Post post = service.findById(id);
        mv.addObject("post",post);
        return mv;
    }
}
