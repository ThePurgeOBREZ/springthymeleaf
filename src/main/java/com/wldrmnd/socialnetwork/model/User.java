package com.wldrmnd.socialnetwork.model;

import lombok.*;

import java.sql.Date;

@Data
@NoArgsConstructor
public class User {
    private String name;
    private String email;
    private String password;
    private String gender;
    private String note;
    private boolean married;
    private Date birthday;
    private String job;
}