package ch.admin.seco.alv.kafkatest.messaging;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;

import java.util.Collections;


@EnableBinding(BlogEntryBinding.class)
public class BlogEntryProducer implements Producer<BlogEntry, BlogEntryBinding> {

    private final MessageChannel messageChannel;

    public BlogEntryProducer(final Binding<BlogEntry> binding) {
        messageChannel = binding.producer();
    }

    @Override
    public void produce(final BlogEntry blogEntry) {
        final Message<BlogEntry> message = MessageBuilder.createMessage(blogEntry, new MessageHeaders(Collections.emptyMap()));
        messageChannel.send(message);
    }
}
