package ch.unil.jobchallenge2022a.core.port;

import ch.unil.jobchallenge2022a.core.model.News;

/**
 * Output port (boundary) for operations on the repository for news.
 */
public interface NewsRepositoryOperationsOutputPort {

    News obtainNewsById(Long id);

}
