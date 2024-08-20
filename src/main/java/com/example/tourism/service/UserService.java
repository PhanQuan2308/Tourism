package com.example.tourism.service;

import com.example.tourism.dto.UserDTO;
import com.example.tourism.entity.User;
import com.example.tourism.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserDTO registerUser(UserDTO userDTO) {
        if(userDTO.getUserName() == null || userDTO.getUserName().isEmpty()) {
            throw new RuntimeException("Username cannot be null or empty");
        }

        if(userRepository.existsByUserName(userDTO.getUserName())){
            throw new RuntimeException("Username is already in use");
        }

        User user = converToEntity(userDTO);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        User savedUser = userRepository.save(user);
        return converToDto(savedUser);
    }


    public UserDTO findUserByUsername(String username) {
        User user = userRepository.findByUserName(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return converToDto(user);
    }

    public User converToEntity(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        user.setUserName(userDTO.getUserName());  // Đảm bảo ánh xạ đúng field
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        user.setEmail(userDTO.getEmail());
        user.setRole(userDTO.getRole());
        return user;
    }


    public UserDTO converToDto(User user) {
        return new UserDTO(
                user.getId(),
                user.getUserName(),
                user.getPassword(), // Password không được trả về từ DTO

                user.getEmail(),
                user.getRole()
        );
    }
}
