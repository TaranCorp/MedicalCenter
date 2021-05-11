package com.javateam.medicalcenter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name="USERS")
@Inheritance(strategy= InheritanceType.JOINED)
@DiscriminatorColumn(name = "USER_TYPE", discriminatorType = DiscriminatorType.STRING)
// Add @DiscriminatorValue("name_type_user) at each child-class.
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "FIRST_NAME")
    private String name;
    @Column(name = "FAMILY_NAME")
    private String surname;
    @Column(name = "PESEL")
    private Long pesel;
    @Column(name = "DATE_OF_BIRTH")
    private Time dateOfBirth;
    @Column(name = "SEX")
    private boolean isMale;
    @Column(name = "MAIL")
    private String email;

}
