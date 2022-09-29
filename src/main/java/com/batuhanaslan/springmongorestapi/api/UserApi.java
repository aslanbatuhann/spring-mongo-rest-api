package com.batuhanaslan.springmongorestapi.api;

import com.batuhanaslan.springmongorestapi.entity.User;
import com.batuhanaslan.springmongorestapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserApi {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public ResponseEntity<User> add(@RequestBody User user){
            return ResponseEntity.ok(userRepository.save(user));
    }
    @GetMapping
    public ResponseEntity<List<User>> allUser(){
        return ResponseEntity.ok(userRepository.findAll());
    }
}
