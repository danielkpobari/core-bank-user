package com.coreBankUser.corebankuser.model.entity;

import com.coreBankUser.corebankuser.model.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authId;

    private String identificationNumber;

    @Enumerated(EnumType.STRING)
    private Status status;
}
