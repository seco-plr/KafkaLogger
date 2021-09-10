package ch.admin.seco.alv.kafkatest.restproducer.infrastructure.messaging;

import ch.admin.seco.alv.kafkatest.domain.LogLevel;
import ch.admin.seco.alv.kafkatest.domain.LogMessage;
import ch.admin.seco.alv.kafkatest.domain.Logger;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;


@EnableBinding(LogBinding.class)
public class LogProducer implements Logger {

    private final MessageChannel messageChannel;

    public LogProducer(final LogBinding logBinding) {
        this.messageChannel = logBinding.messageChannel();
    }

    @Override
    public void log(final LogLevel logLevel, final String message) {
        final Message<?> m = MessageBuilder
                .withPayload(LogMessage.of(logLevel, message))
                .build();
        messageChannel.send(m);
    }
}
