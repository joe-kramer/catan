package com.company;

import java.io.PrintWriter;
import java.util.*;

public class Player {
    private PlayerColor playerColor;
    private Scanner input = new Scanner(System.in);
    private PrintWriter output = new PrintWriter(System.out, true);
    private int victoryPoints = 0;
    private List<Resource> resources = new ArrayList<>();
    private Map<ResourceType, Integer> resourceCards = Map.of(
            ResourceType.BRICK, 0,
            ResourceType.SHEEP, 0,
            ResourceType.STONE, 0,
            ResourceType.WHEAT, 0,
            ResourceType.WOOD, 0);
    private Map<DevelopmentCard, Integer> developmentCards = new HashMap<>();

    public List<Resource> getResources() {
        return resources;
    }

    public void incrementResource(ResourceType resourceType) {
        resourceCards.put(resourceType, resourceCards.get(resourceType) + 1);
    }

    public int getVictoryPoints() {
        return victoryPoints;
    }

    public void setVictoryPoints(int victoryPoints) {
        this.victoryPoints = victoryPoints;
    }

    public Player(PlayerColor playerColor) {
        this.playerColor = playerColor;
    }

    public void sendPlayerMessage(String message) {
        output.println("To " + playerColor + ": " + message);
    }

    public String getPlayerInput() {
        return input.nextLine();
    }

    public PlayerColor getPlayerColor() {
        return playerColor;
    }
}
