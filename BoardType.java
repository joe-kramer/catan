package com.company;

public enum BoardType {
    DEFAULT(5, 5),
    EXPANSION(6,5);

    BoardType(int height, int width) {
        this.height = height;
        this.width = width;
    }

    private int height;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    private int width;
}
