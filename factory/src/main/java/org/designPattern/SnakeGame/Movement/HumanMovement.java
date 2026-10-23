package org.designPattern.SnakeGame.Movement;

import org.designPattern.SnakeGame.Position;

public class HumanMovement implements MovementStrategy {
    @Override
    public Position moveStrategy(Position position, String direction) {
        System.out.println("Moving ....");
        int row = position.getRow();
        int col = position.getCol();

         return switch (direction.toUpperCase()) {
            case "U" -> new Position(row - 1, col);
            case "D" -> new Position(row + 1, col);
            case "L" -> new Position(row, col - 1);
            case "R" -> new Position(row, col + 1);
            default -> position;
        };
    }
}
