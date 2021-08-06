package com.murilonerdx.blog.service.impl;

import com.murilonerdx.blog.model.Post;
import com.murilonerdx.blog.repository.PostRepository;
import com.murilonerdx.blog.service.BlogService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    PostRepository repository;

    @Override
    public List<Post> findAll() {
        return repository.findAll();
    }

    @Override
    public Post findById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return repository.save(post);
    }
}
