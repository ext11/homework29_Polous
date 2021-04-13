package ua.com.alevel.entity;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void getSize() {
        int size = 3;
        Board board = new Board(size);
        assertEquals(board.getSize(),size);
    }

    @Test
    void setSize() {
        int initialSize = 2;
        int newSize = 3;
        Board board = new Board(initialSize);
        board.setSize(newSize);
        assertEquals(board.getSize(),newSize);
    }

    @Test
    void getSpots() {
        int size = 3;
        Board board = new Board(size);
        ArrayList<String> defaultValue = new ArrayList<>();
        for (int i = 0; i < size*3; i++) {
            defaultValue.add(String.valueOf(i));

        }
        assertEquals(board.getSpots(),defaultValue);
    }

    @Test
    void setSpotByNumberOfSpot() {
        int size = 3;
        Board board = new Board(size);
        board.setSpotByNumberOfSpot(String.valueOf(2));
        assertEquals("X",board.getSpots().get(2));
    }
}