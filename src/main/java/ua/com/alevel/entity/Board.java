package ua.com.alevel.entity;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private ArrayList<String> spots;

    public Board(int size) {
        this.size = size;
        this.spots = new ArrayList<String>();
        for (int i = 0; i < size; i++) {
            this.spots.add(String.valueOf(3 * i));
            this.spots.add(String.valueOf(3 * i + 1));
            this.spots.add(String.valueOf(3 * i + 2));
        }
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<String> getSpots() {
        return spots;
    }


    public void setSpotByNumberOfSpot(String value) {
        for (int i = 0; i < size*3; i++) {
            if (spots.get(i).equals(value)) {
                spots.set(i, "X");
            }
        }
    }
}
