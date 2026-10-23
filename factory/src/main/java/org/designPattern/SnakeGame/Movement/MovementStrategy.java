package org.designPattern.SnakeGame.Movement;

import org.designPattern.SnakeGame.Position;

public interface MovementStrategy {
    Position moveStrategy(Position position, String direction);
}
