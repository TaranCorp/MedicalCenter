package com.javateam.medicalcenter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "MedicalCenter")
public class MedicalCenterConfigurationProperties {


}
