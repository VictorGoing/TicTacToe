package com.example.game;

public class Game {

    private String[][] board = {{" "," "," "},{" "," "," "},{" "," "," "}};
    static private Enemy enemy = new Enemy();
    public void updateBoard(int column, int row, String figure){
        board[column][row] = figure;
    }

    public int check(){
        //column0
        if(this.board[0][0] == this.board[0][1] && this.board[0][1] == this.board[0][2] && this.board[0][2] == this.board[0][0] && this.board[0][0] != " ") {
            return 0;
        }
        //column1
        if(this.board[1][0] == this.board[1][1] && this.board[1][1] == this.board[1][2] && this.board[1][2] == this.board[1][0] && this.board[1][0] != " ") {
            return 1;
        }
        //column2
        if(this.board[2][0] == this.board[2][1] && this.board[2][1] == this.board[2][2] && this.board[2][2] == this.board[2][0] && this.board[2][0] != " ") {
            return 2;
        }

        //row0
        if(this.board[0][0] == this.board[1][0] && this.board[1][0] == this.board[2][0] && this.board[2][0] == this.board[0][0] && this.board[0][0] != " ") {
            return 3;
        }
        //row1
        if(this.board[0][1] == this.board[1][1] && this.board[1][1] == this.board[2][1] && this.board[2][1] == this.board[0][1] && this.board[0][1] != " ") {
            return 4;
        }
        //row2
        if(this.board[0][2] == this.board[1][2] && this.board[1][2] == this.board[2][2] && this.board[2][2] == this.board[0][2] && this.board[0][2] != " ") {
            return 5;
        }

        //cors1
        if(this.board[0][0] == this.board[1][1] && this.board[1][1] == this.board[2][2] && this.board[0][0] == this.board[2][2] && this.board[1][1] != " ") {
            return 6;
        }
        //cros2
        if (this.board[0][2] == this.board[1][1] && this.board[1][1] == this.board[2][0] && this.board[0][2] == this.board[2][0] && this.board[1][1] != " ") {
            return 7;
        }
        return 8;
    }

    public void viewBoard(){
        System.out.println("");
        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("---------");
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("---------");
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
        System.out.println("");
    }

    public String[][] getBoard(){
        return board;
    }

    public int nextTurn(String[][] board){
        return enemy.enemyMove(board);
    }

}
