package org.designPattern.TickTacToe.State;

import org.designPattern.TickTacToe.Players.Player;
import org.designPattern.TickTacToe.Symbol;

public class XTurnState implements GameState {
    @Override
    public void next(GameContext context, Player player , boolean hasWon) {
        if(hasWon){
            context.setState(player.getSymbol() == Symbol.X ? new XWinState() : new OWinState());
        }else {
            // Switch to OTurnState
            context.setState(new OTurnState());
        }
    }

    @Override
    public boolean isGameOver() {
        return false;
    }
}
