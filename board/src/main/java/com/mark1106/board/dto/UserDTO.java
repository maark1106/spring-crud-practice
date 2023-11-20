package com.mark1106.board.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class UserDTO {
    private String userName;
    private String userId;
    private String userPw;
}
