package com.javateam.medicalcenter.entity;

import javax.persistence.*;

@Entity
@Table(name="USERS")
@Inheritance(strategy= InheritanceType.JOINED)
@DiscriminatorColumn(name = "USER_TYPE", discriminatorType = DiscriminatorType.STRING)
// W dziedziczących klasach dodajemy @DiscrimunatorValue("nazwa_typu_usera) nad każdą klasą
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

}
