package com.study.mvc20220927cheolmin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class UserReqDto {
    private String username;
    private String password;
    private String name;
    private String email;
}