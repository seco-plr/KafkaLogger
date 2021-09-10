package ch.admin.seco.alv.kafkatest.messaging;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;


public interface CommentBinding extends Binding<Comment> {

    @Output("comments")
    MessageChannel producer();
}
