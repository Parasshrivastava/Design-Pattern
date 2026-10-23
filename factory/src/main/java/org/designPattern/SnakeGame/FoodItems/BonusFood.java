package org.designPattern.SnakeGame.FoodItems;

public class BonusFood extends FoodItem {
    public BonusFood(int row, int col) {
        super(row, col);
        this.points = 20;
    }
}
