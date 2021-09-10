package ch.admin.seco.alv.kafkatest.consoleconsumer.infrastructure.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;


public interface LogBinding {

    @Input("logs")
    SubscribableChannel subscribableChannel();
}
