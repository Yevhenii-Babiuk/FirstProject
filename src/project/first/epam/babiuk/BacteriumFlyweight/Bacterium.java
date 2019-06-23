package project.first.epam.babiuk.BacteriumFlyweight;

import java.util.Timer;
import java.util.TimerTask;

public class Bacterium {
    private String name;
    private String task;
    private String type;
    private boolean active;


    public Bacterium(String name) {
        this.name = name;
    }

    public void setProperties(String task, String type) {
        this.task = task;
        this.type = type;
    }

    public boolean isActive() {
        return active;
    }

    public void addToColony() {
        System.out.println("I am " + type + " bacterium, my name is " + name + ", and my task is " + task);

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                active = false;
                System.out.println(name + " is leaving the colony");
            }
        };
        active = true;

        Timer timer = new Timer();
        timer.schedule(timerTask, 1500);
    }
}
