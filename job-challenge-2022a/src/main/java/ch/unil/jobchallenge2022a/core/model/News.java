package ch.unil.jobchallenge2022a.core.model;

import lombok.Builder;
import lombok.Value;

/**
 * Models a piece of news. Each piece of news has a unique ID and a title.
 */
@Value
@Builder
public class News {
    Long id;
    String title;
}
