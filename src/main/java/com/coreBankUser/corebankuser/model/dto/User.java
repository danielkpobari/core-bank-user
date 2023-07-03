package com.coreBankUser.corebankuser.model.dto;

import com.coreBankUser.corebankuser.model.Status;
import lombok.Data;

@Data
public class User {
    private Long id;
   private String password;
    private String authId;
    private String email;
    private String identification;
    private Status status;
}
