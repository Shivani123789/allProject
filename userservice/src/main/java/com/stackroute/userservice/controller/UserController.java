package com.stackroute.userservice.controller;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.service.UserService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1")
public class UserController {
   private UserService userService;
    public UserController(UserService userService)
    {
        this.userService=userService;

    }
    @PostMapping("user")
    public ResponseEntity<?> saveUser(@RequestBody User user)
    {
        ResponseEntity responseEntity;
        try {
            userService.SaveUser(user);
            responseEntity= new ResponseEntity<String>("successfully create", HttpStatus.CREATED);
        }
        catch (Exception exception)
        {
            responseEntity= new ResponseEntity<String>(exception.getMessage(),HttpStatus.CONFLICT);
        }
//        catch (Exception ex) {
//            System.out.println();
//        }
        //
        //we should all general exception
        return responseEntity;
    }
    @GetMapping("user")
    public ResponseEntity<?> getAllUsers()
    {
        return new ResponseEntity<List<User>>(userService.getAllUsers(),HttpStatus.OK);
    }
}
