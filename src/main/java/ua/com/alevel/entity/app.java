package ua.com.alevel.entity;

public class app {
    public static void main(String[] args) {
        Board board = new Board(3);
        BoardPresenter boardPresenter = new BoardPresenter(board);
        boardPresenter.displayBoard();
        System.out.println("---------------");
        System.out.println(board.getSpots());
        /*board.setSpotByNumberOfSpot(String.valueOf(0));
        board.setSpotByNumberOfSpot(String.valueOf(1));
        board.setSpotByNumberOfSpot(String.valueOf(2));
        boardPresenter.displayBoard();

        System.out.println(CheckingСombinations.getIndexesOfX(board));
        CheckingСombinations.diagonalCheck(CheckingСombinations.getIndexesOfX(board));*/
    }
}
