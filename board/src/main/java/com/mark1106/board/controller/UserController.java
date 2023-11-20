package com.mark1106.board.controller;

import com.mark1106.board.dto.UserDTO;
import com.mark1106.board.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    public UserDTO insertUser(UserDTO user){
        return userService.insertUser(user);
    }

    public List<UserDTO> getAllUsers(){
        return userService.getAllUsers();
    }

    public UserDTO getUserByUserId(String userId){
        return userService.getUserByUserId(userId);
    }

    public void updateUserPw(String userId, UserDTO user){
        userService.updateUserPw(userId, user);
    }

    public void deleteUser(String userId){
        userService.deleteUser(userId);
    }
}
