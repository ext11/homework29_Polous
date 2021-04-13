package ua.com.alevel.entity;

import ua.com.alevel.entity.Board;

public class BoardPresenter {
    Board board;

    public BoardPresenter(Board board) {
        this.board = board;
    }

    public void displayBoard() {
        String formattedBoard = "";
        for (int i = 0; i < this.board.getSize()*this.board.getSize(); i++) {
            String borderOrNewline = "";
            if ((i+1) % board.getSize() == 0) {
                borderOrNewline += "\n";
            }
            else {
                borderOrNewline += " | ";
            }
            formattedBoard += board.getSpots().get(i);
            formattedBoard += borderOrNewline;
        }
        System.out.print(formattedBoard);
    }
}
