package ch.admin.seco.alv.kafkatest.restproducer.infrastructure.messaging;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;


public interface LogBinding {

    @Output("logs")
    MessageChannel messageChannel();
}
