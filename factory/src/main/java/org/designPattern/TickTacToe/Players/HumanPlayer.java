package org.designPattern.TickTacToe.Players;

import org.designPattern.TickTacToe.Board;
import org.designPattern.TickTacToe.Position;


import java.util.Scanner;

public class HumanPlayer implements PlayerStrategy {
    private Scanner scanner;

    private String playerName;

    public HumanPlayer(String playerName) {
        this.playerName = playerName;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public Position makeMove(Board board) {

        while(true){
            try{
                System.out.println(playerName + ", enter your move (row and column): ");
                int row = scanner.nextInt();
                int col = scanner.nextInt();

                if (board.isValidMove(new Position(row, col))) {
                    return new Position(row, col);
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter two integers for row and column.");
                scanner.nextLine(); // Clear the invalid input
            }
        }
    }
}
