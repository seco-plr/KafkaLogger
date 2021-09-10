package ch.admin.seco.alv.kafkatest.messaging;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;


@EnableBinding(CommentBinding.class)
public class GenericProducer<T> {

    private final MessageChannel messageChannel;

    public GenericProducer(@Output("comments") final MessageChannel messageChannel) {
        this.messageChannel = messageChannel;
    }
}
