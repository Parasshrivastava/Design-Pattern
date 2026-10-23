package org.designPattern.SnakeGame.FoodItems;

abstract public class FoodItem {
    protected int row, col;
    protected int points;

    public FoodItem(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getPoints() {
        return points;
    }
}
