package ua.com.alevel.util;

import ua.com.alevel.entity.Board;

import java.util.ArrayList;
import java.util.List;

public class CheckingCombinations {
    private Board board;

    public CheckingCombinations(Board board) {
        this.board = board;
    }

    public static List<Integer> getIndexesOfX(Board board){
        List<Integer> List = new ArrayList<>();
        for (int i = 0; i < board.getSize()*3; i++) {
           if(board.getSpots().get(i).contains("X")){
              List.add(i);
           }
        }
        return List;
    }

    public static boolean Check(List<Integer> indexes) {
        if ((indexes.contains(0) && (indexes.contains(4)) && (indexes.contains(8)))
                ||(indexes.contains(2) && (indexes.contains(4)) && (indexes.contains(6)))) {
            System.out.println("You win. You have built 3 crosses in a row diagonally");
            return true;
        } else if (((indexes.contains(0) && (indexes.contains(1)) && (indexes.contains(2))))
                ||((indexes.contains(3) && (indexes.contains(4)) && (indexes.contains(5))))
                ||((indexes.contains(6) && (indexes.contains(7)) && (indexes.contains(8)))) ) {
            System.out.println("You win. You have built 3 crosses in a row horizontally");
            return true;
        } else if(((indexes.contains(0) && (indexes.contains(3)) && (indexes.contains(6))))
                ||((indexes.contains(1) && (indexes.contains(4)) && (indexes.contains(7)))
                ||((indexes.contains(2) && (indexes.contains(5)) && (indexes.contains(8)))))){
            System.out.println("You win. You have built 3 crosses in a row vertically");
            return true;
        } else{
            System.out.println("Draw");
        }
        return false;
    }
}
