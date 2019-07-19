package com.angularbackend.angularbackend.Repositories;

import com.angularbackend.angularbackend.Models.post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<post, Long> {
}
