package ch.admin.seco.alv.kafkatest.messaging;

import lombok.Value;


@Value
public class Comment {

    String author;

    String content;
}
