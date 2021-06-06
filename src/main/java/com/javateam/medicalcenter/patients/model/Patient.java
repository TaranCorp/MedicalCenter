package com.javateam.medicalcenter.patients.model;

import com.javateam.medicalcenter.users.domain.BasicUser;
import com.javateam.medicalcenter.users.domain.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Patient")
@NoArgsConstructor
public class Patient{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String dateAdmission;
    private String history;
    private String result;
    @Embedded
    private UpdateTime updateTime = new UpdateTime();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateAdmission() {
        return dateAdmission;
    }

    public void setDateAdmission(String dateAdmission) {
        this.dateAdmission = dateAdmission;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void updatePatient(Patient source){
        dateAdmission = source.dateAdmission;
        history = source.history;
        result = source.result;
    }
}
