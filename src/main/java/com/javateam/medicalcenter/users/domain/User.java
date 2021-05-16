package com.javateam.medicalcenter.users.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.math3.random.RandomDataGenerator;

import javax.persistence.*;

@Entity
@Table(name="USERS")
@Inheritance(strategy= InheritanceType.JOINED)
@DiscriminatorColumn(name = "USER_TYPE", discriminatorType = DiscriminatorType.STRING)
// Add @DiscriminatorValue("type_of_user) at each child-class that follows.
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")

    long leftLimit = 1000000L;
    long rightLimit = 3000000L;
    long id = new RandomDataGenerator().nextLong(leftLimit, rightLimit);

    public Long getId () {
        return id;
    }

    @Column(name = "LOGIN")
    private String login;
    @Column(name = "PASSWORD")
    private String password;



}
