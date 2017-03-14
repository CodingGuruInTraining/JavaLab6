package com.mark;

/**
 * This program receives input from the User and collects
 * that data within objects.
 */
public class problem_4 {
    public static void main(String[] args) {
        // Create a 'container' object to hold all of
        // the Lake objects and provide some methods.
        Lakes lakeHolder = new Lakes();
        // Runs functions to receive the User's input.
        String lakeName = lakeHolder.askLakeName();
        double lakeTime = lakeHolder.askLakeTime();
        // Runs function to check if the provided lake name
        // already has an object.
        boolean oldLake = lakeHolder.isPresent(lakeName);
        if (oldLake) {
            // Retrieves the lake's object and adds the
            // new time to its ArrayList.
            Lake lakeObject = lakeHolder.findLakeObject(lakeName);
            lakeObject.enterNewTime(lakeTime);
        }
        else {
            // Creates a new Lake object, which also
            // adds the first value to its ArrayList.
            Lake newLake = new Lake(lakeName, lakeTime);
        }
        // Displays a success message.
        System.out.println("Your results have been updated successfully.");
        // Closes the Scanner objects that are within
        // the container object.
        lakeHolder.closeScanners();
    }
}
