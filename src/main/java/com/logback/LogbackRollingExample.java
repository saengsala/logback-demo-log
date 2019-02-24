package com.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackRollingExample {

    private static final Logger logger = LoggerFactory.getLogger(LogbackRollingExample.class);

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i<1000; i++){
            demoLogDebug(i);
            demoLogInfo(i);
            demoLogError();
            Thread.sleep(5000);
        }
    }

    private static void demoLogDebug(int i){
        logger.debug("User id {} has successfully logged in.", i);
    }

    private static void demoLogInfo(int i){
        logger.info("User id {} entered the password incorrectly.", i);
    }

    private static void demoLogError(){
        logger.error("feature login error may be due to network problems");
    }

}
