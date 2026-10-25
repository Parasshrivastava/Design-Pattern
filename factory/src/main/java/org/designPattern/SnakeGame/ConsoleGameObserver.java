package org.designPattern.SnakeGame;

public class ConsoleGameObserver implements GameObserver {
    @Override
    public void onMoveMade(Position position) {
        System.out.println("Move made at position: " + position.getRow() + ", " + position.getCol());
    }

    @Override
    public void onGameOver(int score) {
        System.out.println("Game over! Final score: " + score);
    }

    @Override
    public void onFoodEaten(Position position, int score) {

        System.out.println("Food eaten at position: " + position.getRow() + ", " + position.getCol() + ". Current score: " + score);
    }

    @Override
    public void onScoreUpdate(int score) {
        System.out.println("Score updated: " + score);
    }
}
