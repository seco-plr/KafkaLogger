package ch.admin.seco.alv.kafkatest.messaging;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;


public interface BlogEntryBinding extends Binding<BlogEntry> {

    @Output("blog-entries")
    MessageChannel producer();
}
