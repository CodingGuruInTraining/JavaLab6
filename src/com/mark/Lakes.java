package com.mark;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by hl4350hb on 3/13/2017.
 */
public class Lakes {
    private ArrayList<Lake> allLakes;
    public Scanner numberScanner;
    public Scanner stringScanner;

    public Lakes () {
        this.allLakes = new ArrayList<Lake>();
        this.numberScanner = new Scanner(System.in);
        this.stringScanner = new Scanner(System.in);
    }

    public void addNewLake(Lake newLake) {
        if (newLake != null) {
            this.allLakes.add(newLake);
        }
    }

    public boolean isPresent(String lakeName) {
        for (Lake lake:this.allLakes) {
            if (lakeName.equalsIgnoreCase(lake.getName())) {
                return true;
            }
        }
        return false;
    }

    public String askLakeName() {
        System.out.println("What lake did you run?");
        String lakeName = stringScanner.nextLine();
        return lakeName;
    }

    public double askLakeTime() {
        System.out.println("What was your time?");
        double lakeTime = numberScanner.nextDouble();
        return lakeTime;
    }

    public Lake findLakeObject(String lakeName) {
        for (Lake lake : this.allLakes) {
            if (lakeName.equalsIgnoreCase(lake.getName())) {
                return lake;
            }
        }
        return null;
    }

    public void closeScanners() {
        numberScanner.close();
        stringScanner.close();
    }
}
