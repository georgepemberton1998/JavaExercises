package com.qa.day8;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerPractise {

    public static void main(String[] args) {
        logMessage("Blah");
    }
    public static Logger LOGGER = LogManager.getLogger();

    public static void logMessage(String message) {
        LOGGER.info(message);
    }


}
