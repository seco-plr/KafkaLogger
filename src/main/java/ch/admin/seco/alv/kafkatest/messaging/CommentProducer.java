package ch.admin.seco.alv.kafkatest.messaging;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;

import java.util.Collections;

public class CommentProducer implements Producer<Comment, CommentBinding> {

    private final MessageChannel messageChannel;

    public CommentProducer(final MessageChannel messageChannel) {
        this.messageChannel = messageChannel;
    }

    @Override
    public void produce(final Comment comment) {
        final Message<Comment> message = MessageBuilder.createMessage(comment, new MessageHeaders(Collections.emptyMap()));
        messageChannel.send(message);
    }
}
