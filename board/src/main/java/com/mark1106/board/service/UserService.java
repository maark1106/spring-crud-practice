package com.mark1106.board.service;

import com.mark1106.board.dto.UserDTO;
import com.mark1106.board.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserDTO insertUser(UserDTO user){
        return userRepository.insertUser(user);
    }

    public List<UserDTO> getAllUsers(){
        return userRepository.getAllUsers();
    }

    public UserDTO getUserByUserId(String userId){
        return userRepository.getUserByUserId(userId);
    }

    public void updateUserPw(String userId, UserDTO user){
        userRepository.updateUserPw(userId, user);
    }

    public void deleteUser(String userId){
        userRepository.deleteUser(userId);
    }
}
