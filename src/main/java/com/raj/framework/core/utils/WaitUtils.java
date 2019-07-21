package com.raj.framework.core.utils;

import com.raj.framework.core.Base;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WaitUtils implements Base {

    public static void waitFor(int sec, String message) {
        Logger logger= LoggerFactory.getLogger("WaitUtils");
        try {
            logger.debug(String.format("Wait for %d sec to %s", sec, message));
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
