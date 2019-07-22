package com.angularbackend.angularbackend.Controllers;

import com.angularbackend.angularbackend.Models.post;
import com.angularbackend.angularbackend.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class postControllers {

    @Autowired
    private PostRepository postRepo;

    @CrossOrigin
    @GetMapping("getAllPosts")
    public Iterable<post> getAllPost(){
        return postRepo.findAll();
    }

    @CrossOrigin
    @GetMapping("getOnePost")
    public Optional<post> getOnePost(){
        return postRepo.findById((long) 2);
    }

}
