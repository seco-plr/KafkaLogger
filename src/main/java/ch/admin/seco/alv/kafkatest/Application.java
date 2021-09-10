package ch.admin.seco.alv.kafkatest;

import ch.admin.seco.alv.kafkatest.messaging.BlogEntry;
import ch.admin.seco.alv.kafkatest.messaging.Comment;
import ch.admin.seco.alv.kafkatest.messaging.Producer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Application {

    public static void main(final String[] arguments) {
        SpringApplication.run(Application.class, arguments);
    }

    @Bean
    public CommandLineRunner createMessages(final Producer<BlogEntry, ?> blogEntryProducer,
                                            final Producer<Comment, ?> commentProducer) {
        return args -> {
            blogEntryProducer.produce(new BlogEntry("Markus", "First entry", "Hello, welcome to my Blog"));
            commentProducer.produce(new Comment("Thomas", "Hey Markus. Nice blog!"));
        };
    }
}
