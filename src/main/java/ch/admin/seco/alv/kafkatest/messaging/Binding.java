package ch.admin.seco.alv.kafkatest.messaging;

import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;


@Service
public interface Binding<T> {

    MessageChannel producer();
}
