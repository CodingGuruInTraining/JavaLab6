package com.mark;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by hl4350hb on 3/13/2017.
 */
public class Lake {
    private String name;
    private ArrayList<Double> allTimes;
    private double fastestTime;
    private double slowestTime;
    public Scanner numberScanner;
    public Scanner stringScanner;

    public Lake (String name, double firstTime) {
        this.name = name;
        this.allTimes.add(firstTime);
        this.fastestTime = firstTime;
        this.slowestTime = firstTime;
        this.numberScanner = new Scanner(System.in);
        this.stringScanner = new Scanner(System.in);
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

    public void closeScanners() {
        numberScanner.close();
        stringScanner.close();
    }

}
