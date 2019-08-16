package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }
    //save method come  from jparepository which implemented by userrepository
    @Override
    public User SaveUser(User user) {
        User savedUser =userRepository.save(user);
        return savedUser;
    }
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
