package com.javateam.medicalcenter.doctors.domain;

import com.javateam.medicalcenter.employees.domain.Employee;
import lombok.AllArgsConstructor;
import javax.persistence.*;

@Entity
@DiscriminatorValue("Doctor")
@AllArgsConstructor
public class Doctor extends Employee {

}
