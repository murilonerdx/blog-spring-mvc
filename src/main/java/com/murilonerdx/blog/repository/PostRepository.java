package com.murilonerdx.blog.repository;

import com.murilonerdx.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
