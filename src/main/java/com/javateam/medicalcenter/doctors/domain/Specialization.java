package com.javateam.medicalcenter.doctors.domain;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Optional;

public enum Specialization {
    FAMILY, CARDIOLOGIST, DENTIST, PSYCHOLOGIST;

    public static Optional<Specialization> parseString(String value) {
        return Arrays.stream(values())
                .filter(specialization -> StringUtils.equalsIgnoreCase(specialization.name(), value))
                .findFirst();
    }
}
