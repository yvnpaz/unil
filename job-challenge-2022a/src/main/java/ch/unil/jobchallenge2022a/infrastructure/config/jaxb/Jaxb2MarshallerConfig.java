package ch.unil.jobchallenge2022a.infrastructure.config.jaxb;

import ch.unil.jobchallenge2022a.infrastructure.config.ApplicationProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * Configuration for JAXB 2 marshaller.
 */
@RequiredArgsConstructor
@Configuration
public class Jaxb2MarshallerConfig {

    private final ApplicationProperties properties;
    @Bean
    public Jaxb2Marshaller initMarshaller() {
        final Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();

        // FIXME: externalize the package used for JAXB bindings as a configurable property
        jaxb2Marshaller.setPackagesToScan(properties.getLocationJaxb());

        // FIXME: externalize the location of the XSD schema as a configurable property
        jaxb2Marshaller.setSchema(new ClassPathResource(properties.getLocationXsd()));

        return jaxb2Marshaller;
    }

}
