package com.example.HrAttendance.Security;

import com.example.HrAttendance.Users.Users;
import lombok.Data;

@Data
public class JwtAuthRequest {

    private  String userName;
    private String password;
}
