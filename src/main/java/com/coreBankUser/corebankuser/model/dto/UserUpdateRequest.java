package com.coreBankUser.corebankuser.model.dto;

import com.coreBankUser.corebankuser.model.Status;
import lombok.Data;

@Data
public class UserUpdateRequest {

    private Status status;
}
