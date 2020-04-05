package com.company;

import java.util.Collections;
import java.util.Stack;

public class BoardFactory {


    public static Board initialize(BoardType boardType) {
        final int height = boardType.getHeight();
        final int width = boardType.getWidth();

        Resource[][] board = new Resource[height][];

        // build board array
        for (int h = 0; h < height; h++) {
            // bottom and top of board
            if (h == 0 || h == height - 1) {
                board[h] = new Resource[height / 2 + 1];
                continue;
            }

            if (h == 1 || h == height - 2) {
                board[h] = new Resource[height / 2 + 2];
                continue;
            }

            // middle
            board[h] = new Resource[width];
        }

        // set resource cards
        Stack<Resource> resourceCards = ResourceFactory.getResourcesForBoard(boardType);
        Collections.shuffle(resourceCards);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = resourceCards.pop();
            }
        }

        return new Board(board);
    }
}