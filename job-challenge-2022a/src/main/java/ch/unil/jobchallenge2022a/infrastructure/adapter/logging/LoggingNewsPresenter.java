package ch.unil.jobchallenge2022a.infrastructure.adapter.logging;

import ch.unil.jobchallenge2022a.core.model.News;
import ch.unil.jobchallenge2022a.core.port.ShowNewsOutputPort;
import ch.unil.jobchallenge2022a.core.report.GenericNewsError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Implementation of a presenter for news which simply outputs its string representation using
 * the local SLFJ logger.
 */
@Slf4j
@Component
public class LoggingNewsPresenter implements ShowNewsOutputPort {
    @Override
    public void presentNews(News news) {
        log.info("[Output] Here are the news: {}", news);
    }

    @Override
    public void presentError(GenericNewsError e) {
        log.error("Error presenting a News: %s".formatted(e.getMessage()));
    }
}
