package com.javateam.medicalcenter.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;

@AllArgsConstructor
@Getter
@Setter

@Table(name="TBL_EMPLOYEES")
@DiscriminatorValue("Employee")
@Entity
public @Data
class Employee extends User {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private String employeePosition;
    private BigDecimal salary;
    private int hireDate;

    public Employee() {

    }

    public Employee(Long ID, String employeeName, String employeeSurname, Long employeePESEL,
                    Time dateOfBirth , String employeePosition, BigDecimal salary, int hireDate, String employeeEmail) {
        this.employeePosition = employeePosition;
        this.salary = salary;
        this.hireDate = hireDate;
        super.setId(ID);
        super.setName(employeeName);
        super.setSurname(employeeSurname);
        super.setPesel(employeePESEL);
        super.setDateOfBirth(dateOfBirth);
        super.setEmail(employeeEmail);

    }

}








