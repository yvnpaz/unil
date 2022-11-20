package ch.unil.jobchallenge2022a.core;

import ch.unil.jobchallenge2022a.core.model.News;
import ch.unil.jobchallenge2022a.core.port.NewsRepositoryOperationsOutputPort;
import ch.unil.jobchallenge2022a.core.port.ShowNewsOutputPort;
import ch.unil.jobchallenge2022a.core.report.GenericNewsError;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShowNewsUseCaseTest {

    @Mock
    private NewsRepositoryOperationsOutputPort newsRepositoryOps;
    @Mock
    private ShowNewsOutputPort presenter;

    @Mock
    private ShowNewsUseCase showNewsUseCase;

    @Test
    void testShowNews() {
        var id = 1L;
        var news = News.builder().id(1L).title("Guerres civiles et révolutions").build();
        BDDMockito.when(newsRepositoryOps.obtainNewsById(id)).thenReturn(news);
        presenter.presentNews(news);
        BDDMockito.verify(presenter, Mockito.times(1)).presentNews(news);
        showNewsUseCase.showNews(id);
        BDDMockito.verify(showNewsUseCase, Mockito.times(1)).showNews(id);
    }

    @Test
    void testShowNewsNotValid() {
        var message = new GenericNewsError("Cannot read XML for news with ID: 10. Error: class path" +
                " resource [news/news_10.xml] cannot be opened because it does not exist");
        var id = 10L;

        presenter.presentError(message);
        BDDMockito.verify(presenter, Mockito.times(1))
                .presentError(message);

        showNewsUseCase.showNews(id);
        BDDMockito.verify(showNewsUseCase, Mockito.times(1))
                .showNews(id);
    }
}