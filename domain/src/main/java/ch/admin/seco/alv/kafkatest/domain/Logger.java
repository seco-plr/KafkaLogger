package ch.admin.seco.alv.kafkatest.domain;


public interface Logger {

    void log(final LogLevel logLevel, final String message);
}
