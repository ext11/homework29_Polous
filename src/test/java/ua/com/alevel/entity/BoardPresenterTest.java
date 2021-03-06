package ua.com.alevel.entity;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class BoardPresenterTest {
    @Test
    void displayBoard() {
        Board board = new Board(3);
        BoardPresenter boardPresenter = new BoardPresenter(board);
        assertNotNull(board);
        assertEquals(board.getSize(), 3);
        assertEquals(boardPresenter.board, board);
    }

}