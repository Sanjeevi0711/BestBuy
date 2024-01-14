package org.project1.BestBuyProject;

import java.sql.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TestingOnRegular {

	public static void main(String[] args) {
        Timer timer = new Timer();
        long delay = 86400000; 

        // Schedule the task to run daily at the specified time
        timer.scheduleAtFixedRate(new TestTask(), new Date(delay), delay);
    }
}

class TestTask extends TimerTask {
    public void run() {


    }
}
