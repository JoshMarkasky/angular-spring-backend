package com.angularbackend.angularbackend.Controllers;

import com.angularbackend.angularbackend.Models.User;
import com.angularbackend.angularbackend.Models.post;
import com.angularbackend.angularbackend.Repositories.PostRepository;
import com.angularbackend.angularbackend.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import java.util.Map;
import java.util.Optional;

@RestController
public class postControllers {

    @Autowired
    private PostRepository postRepo;

    @Autowired
    private UserRepository userRepo;

    @CrossOrigin
    @GetMapping("getAllPosts")
    public Iterable<post> getAllPost(){
        return postRepo.findAll();
    }

    @CrossOrigin
    @GetMapping("getOnePost/{id}")
    public Optional<post> getOnePost(@PathVariable Long id){
        return postRepo.findById(id);
    }

    @CrossOrigin
    @PostMapping("/postPost")
    public String postPost(@RequestBody Map<String, String>data){
        post post = new post();
        Optional<User> user = userRepo.findById((long)1);

        post.setTitle(data.get("title"));
        post.setBody(data.get("body"));
        post.setUser(user.get());

        postRepo.save(post);

        return "it worked!!";
    }

    @CrossOrigin
    @PostMapping("/editPost/{id}")
    public String editPost(@RequestBody Map<String, String>data){
        post post = new post();
        post.setTitle(data.get("title"));
        post.setBody(data.get("body"));

        postRepo.save(post);

        return "it worked";
    }

    @CrossOrigin
    @DeleteMapping("/deletePost/{id}")
    public String deletePost(@PathVariable Long id){
        postRepo.deleteById(id);

        return "it worked";
    }

}
