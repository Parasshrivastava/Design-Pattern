package org.designPattern.SnakeGame;

import org.designPattern.SnakeGame.FoodItems.FoodItem;
import org.designPattern.SnakeGame.Movement.MovementStrategy;

import java.util.ArrayList;

public class SnakeGameController {
    private GameBoard gameBoard;
    private Snake snake;
    private Food food;
    private int score;
    private MovementStrategy movementStrategy;
    private ArrayList<GameObserver> observers = new ArrayList<>();

    public SnakeGameController(int rows, int cols, ArrayList<FoodItem> foodItems,
                              MovementStrategy movementStrategy) {
        this.gameBoard = GameBoard.getInstance(rows, cols);
        this.snake = new Snake();
        this.food = new Food(foodItems);
        this.score = 0;
        this.movementStrategy = movementStrategy;
    }

    public void addObserver(GameObserver observer) {
        if (observer != null && !observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void removeObserver(GameObserver observer) {
        observers.remove(observer);
    }

    private void notifyMoveMade(Position position) {
        for (GameObserver observer : observers) {
            observer.onMoveMade(position);
        }
    }

    public void notifyScoreUpdate(int score) {
        for (GameObserver observer : observers) {
            observer.onScoreUpdate(score);
        }
    }

    private void notifyFoodEaten(Position position, int score) {
        for (GameObserver observer : observers) {
            observer.onFoodEaten(position, score);
        }
    }

    private void notifyGameOver() {
        for (GameObserver observer : observers) {
            observer.onGameOver(score);
        }
    }


    public int getScore() {
        return score;
    }

    public int move(String direction) {

        Position position = snake.getHead().peekFirst();
        Position newPosition = movementStrategy.moveStrategy(position, direction);
        // check if the new position is out of bounds
        if (newPosition.getRow() < 0 || newPosition.getRow() >= gameBoard.getRows() ||
                newPosition.getCol() < 0 || newPosition.getCol() >= gameBoard.getCols()) {
            notifyGameOver();
            return -1; // Game over
        }
        // getting the current tail position of the snake to check if the new position is colliding with the snake's body
        Position currentTail = snake.getHead().peekLast();
        int foodIndex = food.getCurrentFoodIndex();
        ArrayList<FoodItem> foodItems = food.getFoodItemsPositions();
        FoodItem currentFood = foodIndex < foodItems.size() ? foodItems.get(foodIndex) : null;
        boolean ateFood = currentFood != null
                && currentFood.getRow() == newPosition.getRow()
                && currentFood.getCol() == newPosition.getCol();

        for (Position segment : snake.getHead()) {
            boolean sameCell = segment.getRow() == newPosition.getRow()
                    && segment.getCol() == newPosition.getCol();
            if (sameCell && (ateFood || segment != currentTail)) {
                notifyGameOver();
                return -1; // Game over
            }
        }

        if (!ateFood) {
            snake.getHead().pollLast();
            snake.getBodySet().remove(currentTail);
        }

        snake.getHead().addFirst(newPosition);
        snake.getBodySet().put(newPosition, true);

        if (ateFood) {
            score += currentFood.getPoints();
            food.setCurrentFoodIndex(foodIndex, 1);
            notifyFoodEaten(newPosition, score);
        }

        notifyMoveMade(newPosition);
        notifyScoreUpdate(score);

        return score;
    }
}
