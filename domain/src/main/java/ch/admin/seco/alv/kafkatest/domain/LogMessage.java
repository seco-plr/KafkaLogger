package ch.admin.seco.alv.kafkatest.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogMessage {

    public static LogMessage of(final LogLevel logLevel, final String message) {
        return new LogMessage(logLevel, message);
    }

    LogLevel logLevel;

    String message;
}
