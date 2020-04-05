package com.company;

public enum ResourceType {
    BRICK("BR"),
    DESERT("DE"),
    SHEEP("SH"),
    STONE("ST"),
    WHEAT("WH"),
    WOOD("WO");

    private String charId;

    ResourceType(String charId) {
        this.charId = charId;
    }

    public String getCharId() {
        return charId;
    }
}
