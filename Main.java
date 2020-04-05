package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Board board = BoardFactory.initialize(BoardType.DEFAULT);
        Player[] players = new Player[3];
        players[0] = new Player(PlayerColor.BLUE);
        players[1] = new Player(PlayerColor.RED);
        players[2] = new Player(PlayerColor.WHITE);

        Game game = new Game(board, players);

        try {
            game.start();
        } catch (Exception e) {
            System.out.println("Game exception: " + e.getMessage());
        }

        PairOfDice pairOfDice = new PairOfDice();

    }
}
