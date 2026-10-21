package org.designPattern.TickTacToe.State;

import org.designPattern.TickTacToe.Players.Player;

public class OWinState implements GameState {
    @Override
    public void next(GameContext context, Player player , boolean hasWon) {
        // Game over, no next state
    }
    @Override
    public boolean isGameOver() {
        return true;
    }
}
