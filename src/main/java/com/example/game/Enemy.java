package com.example.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Enemy {

    public int enemyMove(String[][] board){
        return toInt(enemyThinking(searchMove(board)));
    }



    private ArrayList<Pair<Integer,Integer>> searchMove(String[][]board){
        ArrayList<Pair<Integer,Integer>> available = new ArrayList<>();
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++){
                if(board[i][j] == " ") available.add(new Pair<>(i,j));
            }
        return available;
    }

    private Pair<Integer,Integer> enemyThinking(ArrayList<Pair<Integer,Integer>> available){
        Random random = new Random();
        return available.get(random.nextInt(available.size()));
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
