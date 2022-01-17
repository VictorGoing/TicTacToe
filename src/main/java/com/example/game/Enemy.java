package com.example.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Enemy {

    public int enemyMove(String[][] board){
        return toInt(enemyThinking(searchMove(board),board));
    }



    private ArrayList<Pair<Integer,Integer>> searchMove(String[][]board){
        ArrayList<Pair<Integer,Integer>> available = new ArrayList<>();
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++){
                if(board[i][j].equals(" ")) available.add(new Pair<>(i,j));
            }
        return available;
    }

    private Pair<Integer,Integer> enemyThinking(ArrayList<Pair<Integer,Integer>> available,String[][] board){
        if(available.size() == 0) return new Pair<>(3,3);
        Random random = new Random();
        ArrayList<Pair<Integer,Integer>> helpdesk = finishMove(available,board,"x");

        //System.out.println("Hey: " + helpdesk.size());
        if(helpdesk.size() == 1){
            System.out.println("FATALITY!!");
            return helpdesk.get(0);
        }
        helpdesk = finishMove(available,board,"o");
        System.out.println("Hey: " + helpdesk.size());
        if(helpdesk.size() == 1){
            System.out.println("BLOCK!!");
            return helpdesk.get(0);
        }
        if(board[1][1].equals(" "))
        {
            return new Pair<>(1,1);

        }
        return available.get(random.nextInt(available.size()));
    }

    private ArrayList<Pair<Integer,Integer>> finishMove(ArrayList<Pair<Integer,Integer>> available,String[][] board, String shape){
        ArrayList<Pair<Integer,Integer>> newAvailable = new ArrayList<>();
        //columns
        int xCount =0;
        int emptyCount = 0;
        for(int i = 0; i < 3; i++){
            xCount = 0;
            emptyCount = 0;
            for(int j = 0; j < 3; j++){
                if(board[i][j].equals(shape)) xCount+=1;
                if(board[i][j].equals(" ")) emptyCount+=1;
            }
            if(xCount == 2 && emptyCount == 1){

                for(int j = 0; j < 3; j++){
                    if(board[i][j] == " "){
                        System.out.println("I get column something");
                        newAvailable.add(new Pair<>(i,j));
                        return newAvailable;
                    }
                }
            }
        }
        //column
        xCount = 0;
        emptyCount = 0;
        for(int i = 0; i < 3; i++){
            xCount = 0;
            emptyCount = 0;
            for(int j = 0; j < 3; j++){
                if(board[j][i].equals(shape)) xCount+=1;
                if(board[j][i].equals(" ")) emptyCount+=1;
            }
            if(xCount == 2 && emptyCount == 1){

                for(int j = 0; j < 3; j++){
                    if(board[j][i].equals(" ")){
                        System.out.println("I get column something");
                        newAvailable.add(new Pair<>(j,i));
                        return newAvailable;
                    }
                }
            }
        }
        //cross1
        xCount = 0;
        emptyCount = 0;
        Pair<Integer,Integer> helpPair = new Pair<>(3,3);
        for(int i = 0; i < 3; i++){
            if(board[i][i].equals(shape)) xCount+=1;
            if(board[i][i].equals(" ")){
                emptyCount+=1;
                helpPair = new Pair<>(i,i);
            }
        }
        if(xCount == 2 && emptyCount == 1 && helpPair.getLeft() != 3){
            System.out.println("I get something");
            newAvailable.add(helpPair);
            return newAvailable;
        }
        //cross2
        xCount = 0;
        emptyCount = 0;
        for(int i = 0; i < 3; i++){
            if(board[i][2-i].equals(shape)) xCount+=1;
            if(board[i][2-i].equals(" ")){
                emptyCount+=1;
                helpPair = new Pair<>(i,2-i);
            }
        }
        if(xCount == 2 && emptyCount == 1 && helpPair.getLeft() != 3){
            System.out.println("I get something");
            newAvailable.add(helpPair);
            return newAvailable;
        }
        return available;
    }
    private int toInt(Pair<Integer,Integer> pair){
        int result = 0;
        String left = pair.getLeft().toString();
        String right = pair.getRight().toString();
        String word = left +right;
        result = Integer.parseInt(word);

        return result;
    }
}
