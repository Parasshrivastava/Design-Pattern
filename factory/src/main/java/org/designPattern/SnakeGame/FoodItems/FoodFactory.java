package org.designPattern.SnakeGame.FoodItems;

public class FoodFactory {
    public static FoodItem createFood(int []position, String foodType) {
        if (foodType.equalsIgnoreCase("BadFood")) {
            return new BadFood(position[0], position[1]);
        } else if (foodType.equalsIgnoreCase("BonusFood")) {
            return new BonusFood(position[0], position[1]);
        } else {
            return new NormalFood(position[0], position[1]);
        }
    }
}
