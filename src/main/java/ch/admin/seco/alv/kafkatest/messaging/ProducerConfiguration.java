package ch.admin.seco.alv.kafkatest.messaging;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;


@EnableBinding({
        CommentBinding.class
})
public class ProducerConfiguration {

    @Bean
    public Producer<Comment, ? extends Binding<Comment>> commentProducer(final CommentBinding commentBinding) {
        return new CommentProducer(commentBinding.producer());
    }
}
