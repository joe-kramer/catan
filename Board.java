package com.company;

public class Board {
    private Resource[][] board;

    public Board(Resource[][] board) {
        this.board = board;
    }

    public void print() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j].toString());
            }
            System.out.println();
        }
    }
}