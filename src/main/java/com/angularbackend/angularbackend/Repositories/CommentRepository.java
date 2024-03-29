package com.angularbackend.angularbackend.Repositories;

import com.angularbackend.angularbackend.Models.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {

}
