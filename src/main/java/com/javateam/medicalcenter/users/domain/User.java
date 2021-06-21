package com.javateam.medicalcenter.users.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class User {

    @Column(name = "LOGIN")
    private String login;
    @Column(name = "PASSWORD")
    private String password;



}
