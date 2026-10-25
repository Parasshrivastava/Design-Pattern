package org.designPattern.SnakeGame;

public interface GameObserver {
    void onMoveMade(Position position);
    void onGameOver(int score);
    void onFoodEaten(Position position,int score);
     void onScoreUpdate(int score);
}
