package org.designPattern.SnakeGame;

import org.designPattern.SnakeGame.FoodItems.FoodItem;

import java.util.ArrayList;

public class Food {
    private ArrayList<FoodItem> foodItemsPositions;
    private int currentFoodIndex;

    public Food(ArrayList<FoodItem> foodItemsPositions) {
        {
            this.foodItemsPositions = foodItemsPositions;
            this.currentFoodIndex = 0;
        }

    }

    public ArrayList<FoodItem> getFoodItemsPositions() {
        return foodItemsPositions;
    }

    public void setFoodItemsPositions(ArrayList<FoodItem> foodItemsPositions) {
        this.foodItemsPositions = foodItemsPositions;
    }

    public int getCurrentFoodIndex() {
        return currentFoodIndex;
    }

    public void setCurrentFoodIndex(int currentFoodIndex, int increment) {
        this.currentFoodIndex = currentFoodIndex + increment;
    }
}