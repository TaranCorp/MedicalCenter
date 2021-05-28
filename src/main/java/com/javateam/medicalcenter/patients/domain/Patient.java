package com.javateam.medicalcenter.patients.domain;

import com.javateam.medicalcenter.users.domain.BasicUser;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Patient")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Patient extends BasicUser {

}
