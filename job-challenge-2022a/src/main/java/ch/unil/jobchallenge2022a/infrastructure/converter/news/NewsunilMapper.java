package ch.unil.jobchallenge2022a.infrastructure.converter.news;


import ch.unil.jobchallenge2022a.core.model.News;
import ch.unil.jobchallenge2022a.generated.jaxb.NewsunilType;

/**
 * Converter from a JAXB generated {@link NewsunilType} to a corresponding model
 * object: {@link News}.
 */
public interface NewsunilMapper {
    News convert(NewsunilType newsunilType);
}
