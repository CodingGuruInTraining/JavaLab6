package com.mark;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by hl4350hb on 3/13/2017.
 */
public class Lakes {
    // Attributes.
    private ArrayList<Lake> allLakes;
    public Scanner numberScanner;
    public Scanner stringScanner;

    // Constructor.
    public Lakes () {
        this.allLakes = new ArrayList<Lake>();
        this.numberScanner = new Scanner(System.in);
        this.stringScanner = new Scanner(System.in);
    }
    // Adds new lake to container ArrayList.
    public void addNewLake(Lake newLake) {
        if (newLake != null) {
            this.allLakes.add(newLake);
        }
    }
    // Checks if provided lake name has an object.
    public boolean isPresent(String lakeName) {
        for (Lake lake:this.allLakes) {
            if (lakeName.equalsIgnoreCase(lake.getName())) {
                return true;
            }
        }
        return false;
    }
    // Prompts User for input and returns response.
    public String askLakeName() {
        System.out.println("What lake did you run?");
        String lakeName = stringScanner.nextLine();
        return lakeName;
    }
    // Prompts User for input and returns response.
    public double askLakeTime() {
        System.out.println("What was your time?");
        double lakeTime = numberScanner.nextDouble();
        return lakeTime;
    }
    // Searches container for a lake object's name.
    public Lake findLakeObject(String lakeName) {
        for (Lake lake : this.allLakes) {
            if (lakeName.equalsIgnoreCase(lake.getName())) {
                return lake;
            }
        }
        return null;
    }
    // Ending method to close out Scanner objects.
    public void closeScanners() {
        numberScanner.close();
        stringScanner.close();
    }
}
