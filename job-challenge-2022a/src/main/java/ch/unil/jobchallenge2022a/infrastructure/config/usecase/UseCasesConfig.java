package ch.unil.jobchallenge2022a.infrastructure.config.usecase;

import ch.unil.jobchallenge2022a.core.port.ShowNewsInputPort;
import ch.unil.jobchallenge2022a.core.ShowNewsUseCase;
import ch.unil.jobchallenge2022a.core.port.ShowNewsOutputPort;
import ch.unil.jobchallenge2022a.core.port.NewsRepositoryOperationsOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Configuration of a bean which will be the runtime implementation
 * of {@link ShowNewsInputPort} use case.
 */
@Configuration
public class UseCasesConfig {

    @Autowired
    private ShowNewsOutputPort presenter;

    @Autowired
    private NewsRepositoryOperationsOutputPort newsRepositoryOps;

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public ShowNewsInputPort showNewsUseCase() {
        return new ShowNewsUseCase(presenter, newsRepositoryOps);
    }


}
