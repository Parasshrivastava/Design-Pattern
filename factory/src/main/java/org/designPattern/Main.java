package org.designPattern;

import org.designPattern.SnakeGame.ConsoleGameObserver;
import org.designPattern.SnakeGame.FoodItems.FoodFactory;
import org.designPattern.SnakeGame.FoodItems.FoodItem;
import org.designPattern.SnakeGame.Movement.HumanMovement;
import org.designPattern.SnakeGame.SnakeGameController;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<FoodItem> foodItems = new ArrayList<>();
        foodItems.add(FoodFactory.createFood(new int[]{0, 1}, "BonusFood"));
        foodItems.add(FoodFactory.createFood(new int[]{0, 2}, "NormalFood"));
        foodItems.add(FoodFactory.createFood(new int[]{1, 0}, "BadFood"));

        HumanMovement humanMovement = new HumanMovement();
        SnakeGameController game = new SnakeGameController(5, 5, foodItems, humanMovement);
        game.addObserver(new ConsoleGameObserver());

        System.out.println("===== SNAKE GAME DEMO =====");
        System.out.println("Food types: BonusFood (good), NormalFood (neutral), BadFood (bad)");

        // To eat all foods in the order defined above:
        // start at (0,0) -> (0,1) -> (0,2) -> (1,2) -> (1,1) -> (1,0)
        game.move("R");
        game.move("R");
        game.move("D");
        game.move("L");
        game.move("L");

        System.out.println("Final score: " + game.getScore());
    }
}