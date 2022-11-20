package ch.unil.jobchallenge2022a.infrastructure.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
@Data
public class ApplicationProperties {
    private String locationNews;
    private String locationJaxb;
    private String locationXsd;
}
