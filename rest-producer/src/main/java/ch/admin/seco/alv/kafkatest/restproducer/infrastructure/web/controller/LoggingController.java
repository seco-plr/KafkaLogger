package ch.admin.seco.alv.kafkatest.restproducer.infrastructure.web.controller;

import ch.admin.seco.alv.kafkatest.domain.LogLevel;
import ch.admin.seco.alv.kafkatest.domain.Logger;
import org.springframework.core.convert.ConversionFailedException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoggingController {

    private final Logger logger;

    public LoggingController(final Logger logger) {
        this.logger = logger;
    }

    @GetMapping("log/{type}/{message}")
    public void handleLog(@PathVariable(name = "type") final LogLevel logLevel,
                          @PathVariable(name = "message") final String message) {
        logger.log(logLevel, message);
    }

    @ExceptionHandler(ConversionFailedException.class)
    public ResponseEntity<?> handleConversionError(final ConversionFailedException exception) {
        return ResponseEntity.badRequest()
                .body("Cannot map value to LogLevel");
    }
}
