package ch.admin.seco.alv.kafkatest.messaging;

import lombok.Value;


@Value
public class BlogEntry {

    String author;

    String title;

    String content;
}
