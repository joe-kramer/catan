package com.company;

import java.util.*;

public class ResourceFactory {

    public static Stack<Resource> getResourcesForBoard(BoardType boardType) {
        Stack<Resource> resources = new Stack<>();
        switch (boardType) {
            case EXPANSION:
                addResourcesToStack(resources, ResourceType.BRICK, 4);
                addResourcesToStack(resources, ResourceType.DESERT, 1);
                addResourcesToStack(resources, ResourceType.SHEEP, 4);
                addResourcesToStack(resources, ResourceType.STONE, 3);
                addResourcesToStack(resources, ResourceType.WHEAT, 4);
                addResourcesToStack(resources, ResourceType.WOOD, 4);
                break;
            case DEFAULT:
                addResourcesToStack(resources, ResourceType.BRICK, 4);
                addResourcesToStack(resources, ResourceType.DESERT, 1);
                addResourcesToStack(resources, ResourceType.SHEEP, 4);
                addResourcesToStack(resources, ResourceType.STONE, 3);
                addResourcesToStack(resources, ResourceType.WHEAT, 4);
                addResourcesToStack(resources, ResourceType.WOOD, 4);
                break;
            default:
                throw new IllegalArgumentException("Unknown BoardType: " + boardType);
        }

        return resources;
    }

    private static void addResourcesToStack(Stack<Resource> resources, ResourceType resourceType, int count) {
        while (count > 0) {
            resources.add(new Resource(resourceType));
            count--;
        }
    }
}
