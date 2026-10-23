package org.designPattern.SnakeGame;

public class GameBoard {
   private static GameBoard instance;
   private int rows;
   private int cols;

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    private GameBoard(int rows, int cols){
       this.instance=GameBoard.getInstance(rows,cols);
         this.rows = rows;
         this.cols = cols;
   }

    public static GameBoard getInstance(int rows, int cols){
         if(instance==null){
              instance=new GameBoard(rows,cols);
         }
         return instance;
    }
}

