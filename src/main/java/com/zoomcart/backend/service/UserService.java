package com.zoomcart.backend.service;

import com.zoomcart.backend.model.entity.User;
import com.zoomcart.backend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;

        Optional<User> user = userRepository.findByUsername("ameen");
        System.out.println("simple query");
        System.out.println(user.get().toString());
    }
}
