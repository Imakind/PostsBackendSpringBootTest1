package com.akzhan.springmvcApp.repo;

import org.springframework.data.repository.CrudRepository;
import com.akzhan.springmvcApp.models.Post;

public interface PostRepository  extends CrudRepository<Post, Long> {}
