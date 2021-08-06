package com.murilonerdx.blog.service;

import com.murilonerdx.blog.model.Post;

import java.util.List;

public interface BlogService {
    List<Post> findAll();
    Post findById(Long id);
    Post save(Post post);
}
