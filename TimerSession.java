/*
Karan Thaker
Session Bean - Timer
*/


package com.sun.tutorial.javaee.ejb.timersession;

import javax.ejb.Remote;
import javax.ejb.Timer;


@Remote
public interface TimerSession {
    public void setTimer(long intervalDuration);

    public void timeout(Timer timer);
}
