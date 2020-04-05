package com.company;

/**
 * Represents a hexagonal resource
 *  _
 * / \
 * \_/
 *
 *  /\
 * |10|
 *  \/
 *
 * A. Top _
 * B. Top Right \
 * C. Bottom Right /
 * D. Bottom _
 * E. Bottom Left \
 * F. Top Left /
 */
public class Resource {
    private ResourceType resourceType;
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public Resource(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public String toString() {
        return "[" + resourceType.getCharId() + "]";
    }

    public int getNumber() {
        return number;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }
}
