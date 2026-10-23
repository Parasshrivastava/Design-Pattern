package org.designPattern.SnakeGame.FoodItems;

public class BadFood extends FoodItem {
    public BadFood(int row, int col) {
        super(row, col);
        this.points = -10;
    }
}
