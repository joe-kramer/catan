package com.company;

public class Game {

    private final PairOfDice pairOfDice = new PairOfDice();
    private int turnCount = 0;
    private Board board;
    private Player[] players;
    private Player currentPlayer;

    public Game(Board board, Player[] players) {
        this.board = board;
        this.players = players;
    }

    public void start() throws Exception {

        while (!isGameOver()) {
            System.out.println(turnCount);
            currentPlayer = players[turnCount++ % players.length];

            actionPreRoll();
            actionRollDice();
            actionPostRoll();

            currentPlayer.setVictoryPoints(currentPlayer.getVictoryPoints() + 1);
        }

        System.out.println("Game over. " + currentPlayer.getPlayerColor() + " wins");
    }

    private boolean isGameOver() {
        for (Player player : players)
            if (player.getVictoryPoints() >= RuleUtils.POINTS_TO_WIN)
                return true;

        return false;
    }

    private void actionPreRoll() throws Exception {
        currentPlayer.sendPlayerMessage("would you like to make a pre-roll move? [y/n]");
        String response = currentPlayer.getPlayerInput();

        if (response.equalsIgnoreCase("n")) {
            System.out.println("Player declined pre-roll action");
        } else if (response.equalsIgnoreCase("y")) {
            System.out.println("Player would like to make pre-roll move");
            // TODO pre-roll move
        } else {
            throw new Exception("Player must select y or n");
        }
    }

    private void actionRollDice() {
        int roll = pairOfDice.rollDice();

        if (roll == 7) {
            actionSevenRolled();
            return;
        }

        // pickup resource cards for each player
        for (Player player : players) {
            for (Resource resource : player.getResources()) {
                if (resource.getNumber() == roll) {
                    player.incrementResource(resource.getResourceType());
                }
            }
        }
    }

    private void actionPostRoll() throws Exception {
        currentPlayer.sendPlayerMessage("Would you like to make a post-roll move? [y/n]");
        String response = currentPlayer.getPlayerInput();

        if (response.equalsIgnoreCase("n")) {
            System.out.println("Player declined post-roll action");
        } else if (response.equalsIgnoreCase("y")) {
            System.out.println("Player would like to make post-roll move");
            // TODO post-roll move
        } else {
            throw new Exception("Player must select y or n");
        }
    }

    private void actionSevenRolled() {
        System.out.println("Oh shit, a 7 was rolled. If you have over 7 cards, discard count / 2");
    }
}
