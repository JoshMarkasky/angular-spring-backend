package com.angularbackend.angularbackend.Controllers;

import com.angularbackend.angularbackend.Models.User;
import com.angularbackend.angularbackend.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepo;

    @CrossOrigin
    @GetMapping("/getUsers")
    public Iterable<User> getUsers(){

        return userRepo.findAll();

    }

    @CrossOrigin
    @PostMapping("/postUser")
    public String postUser(@RequestBody Map<String, String> data){
        User user = new User();

        user.setUsername(data.get("username"));
        user.setPassword(data.get("password"));
        user.setEmail(data.get("email"));

        userRepo.save(user);

        return "it worked";
    }

}
