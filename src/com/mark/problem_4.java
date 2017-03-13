package com.mark;

/**
 * Created by hl4350hb on 3/13/2017.
 */
public class problem_4 {
    public static void main(String[] args) {
        Lakes lakeHolder = new Lakes();

        String lakeName = lakeHolder.askLakeName();
        double lakeTime = lakeHolder.askLakeTime();
        boolean oldLake = lakeHolder.isPresent(lakeName);
        if (oldLake) {
            // match name with those in arraylist
        }
    }
}
