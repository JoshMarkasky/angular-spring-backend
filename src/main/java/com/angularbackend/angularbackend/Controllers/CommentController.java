package com.angularbackend.angularbackend.Controllers;

import com.angularbackend.angularbackend.Models.Comment;
import com.angularbackend.angularbackend.Repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    @Autowired
    public CommentRepository commentRepo;

    @GetMapping("getAllComments")
    public Iterable<Comment> getAllComments(){
        return commentRepo.findAll();
    }

}
