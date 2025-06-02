package com.example.user_management.domain.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserReqDto {
    String firstname;
    String lastname;
    String username;
    String password;
    String phone;
}
