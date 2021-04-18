package ua.com.alevel.util;

import org.junit.jupiter.api.Test;
import ua.com.alevel.entity.Board;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CheckingCombinationsTest {


    @Test
    void Check() {
        int size = 3;
        Board board = new Board(size);
        board.setSpotByNumberOfSpot(String.valueOf(2));
        board.setSpotByNumberOfSpot(String.valueOf(4));
        board.setSpotByNumberOfSpot(String.valueOf(6));
        List<Integer> indexs = CheckingCombinations.getIndexesOfX(board);
        assertTrue(CheckingCombinations.checkAllPossibleCombinations(indexs));


        /*Board board2 = new Board(size);
        board2.setSpotByNumberOfSpot(String.valueOf(2));
        board2.setSpotByNumberOfSpot(String.valueOf(5));
        board2.setSpotByNumberOfSpot(String.valueOf(8));
        List<Integer> indexs2 = CheckingCombinations.getIndexesOfX(board2);
        assertTrue(CheckingCombinations.Check(indexs2));*/
    }
}