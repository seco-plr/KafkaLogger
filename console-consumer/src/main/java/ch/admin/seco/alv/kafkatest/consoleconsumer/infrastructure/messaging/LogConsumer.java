package ch.admin.seco.alv.kafkatest.consoleconsumer.infrastructure.messaging;

import ch.admin.seco.alv.kafkatest.domain.LogLevel;
import ch.admin.seco.alv.kafkatest.domain.LogMessage;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;


@EnableBinding(LogBinding.class)
public class LogConsumer {

    @StreamListener(target = "logs")
    public void handleLogMessage(@Payload final LogMessage logMessage) {
        final LogLevel logLevel = logMessage.getLogLevel();
        final String msg = logMessage.getMessage();
        System.out.printf("%s :: %s\n", logLevel.name().toUpperCase(), msg);
    }
}
