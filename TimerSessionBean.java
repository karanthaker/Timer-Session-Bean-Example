/*
Karan Thaker
Session Bean - Timer
*/


package com.sun.tutorial.javaee.ejb.timersession;

import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;


/**
This bean creates a timer and prints out a message when a timeout occurs.
*/

@Stateless
public class TimerSessionBean implements TimerSession {
    private static final Logger logger = Logger.getLogger(
                "com.sun.tutorial.javaee.ejb.timersession.TimerSessionBean");
    @Resource
    TimerService timerService;

    public void setTimer(long intervalDuration) {
        Timer timer = timerService.createTimer(
                    intervalDuration,
                    "Created new timer");
    }

    @Timeout
    public void timeout(Timer timer) {
        logger.info("Timeout occurred");
    }
}
