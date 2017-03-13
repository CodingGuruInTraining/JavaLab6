package com.mark;

import java.util.ArrayList;

/**
 * This Class outlines the properties that one may
 * want to save when tracking their running times.
 */
public class Lake {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFastestTime() {
        return fastestTime;
    }

    public void setFastestTime(double fastestTime) {
        this.fastestTime = fastestTime;
    }

    public double getSlowestTime() {
        return slowestTime;
    }

    public void setSlowestTime(double slowestTime) {
        this.slowestTime = slowestTime;
    }

    private String name;
    private ArrayList<Double> allTimes;
    private double fastestTime;
    private double slowestTime;

    public Lake (String name, double firstTime) {
        this.name = name;
        this.allTimes.add(firstTime);
        this.fastestTime = firstTime;
        this.slowestTime = firstTime;
    }

    public void enterNewTime(double newTime) {
        this.allTimes.add(newTime);
        if (newTime < this.fastestTime) {
            this.fastestTime = newTime;
        }
        else if (newTime > this.slowestTime) {
            this.slowestTime = newTime;
        }
    }
}
