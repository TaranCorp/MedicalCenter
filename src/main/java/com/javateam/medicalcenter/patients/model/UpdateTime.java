package com.javateam.medicalcenter.patients.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

@Embeddable
@Getter
@Setter
public class UpdateTime {
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;

    @PrePersist
    public void createdTime(){
        createdOn= LocalDateTime.now();
    }
    @PreUpdate
    public void updateTime(){
        updatedOn = LocalDateTime.now();
    }
}
