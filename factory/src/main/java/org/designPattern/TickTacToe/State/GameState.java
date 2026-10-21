package org.designPattern.TickTacToe.State;

import org.designPattern.TickTacToe.Players.Player;

public interface GameState {
    void next(GameContext context, Player player , boolean hasWon);
    boolean isGameOver();
}