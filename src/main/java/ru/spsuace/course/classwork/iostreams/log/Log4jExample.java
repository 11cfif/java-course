package ru.spsuace.course.classwork.iostreams.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jExample {
    private static final Logger log = LogManager.getLogger(Log4jExample.class);

    public static void main(String[] args) {
        log.debug("Start program");

        log.debug("Start argumentsInfo");
        argumentsInfo("Hello, world!", 42d);
        log.debug("Finish argumentsInfo");

        log.debug("Start maybeException");
        try {
            maybeException();
        } catch (IllegalStateException e) {
            log.error("Exception caught ", e);
            System.exit(2);
        }
        log.debug("Finish maybeException");
    }

    public static void argumentsInfo(String first, double second) {
        log.info("method argumentsInfo with arg1 = " + first + ", arg2 = " + second);
        log.info("method argumentsInfo with arg1 = {}, arg2 = {}", first, second);
    }

    public static void maybeException() {
        double random = Math.random();
        log.debug("Generated random number: {0}", random);
        if (random < 0.5) {
            throw new IllegalArgumentException("Invalid phase of the Moon");
        }
    }
}
