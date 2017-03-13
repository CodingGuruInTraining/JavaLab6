package com.mark;

import java.util.ArrayList;

/**
 * Created by hl4350hb on 3/13/2017.
 */
public class Lakes {
    private ArrayList<Lake> allLakes;


    public Lakes () {
        this.allLakes = new ArrayList<Lake>();
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
}
