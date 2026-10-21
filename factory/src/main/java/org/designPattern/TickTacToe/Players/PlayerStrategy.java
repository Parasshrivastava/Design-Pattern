package org.designPattern.TickTacToe.Players;

import org.designPattern.TickTacToe.Board;
import org.designPattern.TickTacToe.Position;

public interface PlayerStrategy {
    public Position makeMove (Board board);
}
