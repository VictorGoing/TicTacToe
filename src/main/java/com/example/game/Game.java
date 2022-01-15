package com.example.game;

public class Game {

    private String[][] board = {{" "," "," "},{" "," "," "},{" "," "," "}};

    public void updateBoard(int column, int row, String figure){
        board[column][row] = figure;
    }

    public void viewBoard(){
        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("---------");
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("---------");
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
    }



}
