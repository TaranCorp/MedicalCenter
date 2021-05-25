package com.javateam.medicalcenter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "medical-center")
public class MedicalCenterConfigurationProperties {


}
