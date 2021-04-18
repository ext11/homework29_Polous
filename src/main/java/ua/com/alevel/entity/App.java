package ua.com.alevel.entity;

public class App {
    public static void main(String[] args) {
        Board board = new Board(3);
        BoardPresenter boardPresenter = new BoardPresenter(board);
        boardPresenter.displayBoard();
        System.out.println("---------------");
        System.out.println(board.getSpots());

    }
}
