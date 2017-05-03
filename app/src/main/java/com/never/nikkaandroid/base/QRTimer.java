package com.never.nikkaandroid.base;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by toby on 02/05/2017.
 */

public class QRTimer {
    final int time = 10;
    Timer timer;
    TimerTask timerTask;
    int  t = time;
    QRTimerInterface timeInface;

    public  QRTimer(){
        timer = new Timer();
        timerTask = new TimerTask() {
            @Override
            public void run() {
                if(t == 0){
                    t = time;
                    timeInface.runBlock();
                }
            }
        };
    }

    public void start(){

        this.timer.schedule(timerTask,1000,1000);
    }

    public void setTimerInterface(QRTimerInterface timerInterface){
        this.timeInface = timerInterface;
    }
}

