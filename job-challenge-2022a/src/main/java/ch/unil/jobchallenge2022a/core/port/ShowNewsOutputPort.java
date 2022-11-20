package ch.unil.jobchallenge2022a.core.port;

import ch.unil.jobchallenge2022a.core.model.News;
import ch.unil.jobchallenge2022a.core.report.GenericNewsError;

/**
 * Output port (boundary) for presenting a piece of news.
 */
public interface ShowNewsOutputPort {

    void presentNews(News news);

    void presentError(GenericNewsError e);
}
