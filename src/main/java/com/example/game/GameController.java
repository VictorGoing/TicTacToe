package com.example.game;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.IOException;


public class GameController extends Button  {

    @FXML
    private Button button00;
    @FXML
    private Button button01;
    @FXML
    private Button button02;
    @FXML
    private Button button10;
    @FXML
    private Button button11;
    @FXML
    private Button button12;
    @FXML
    private Button button20;
    @FXML
    private Button button21;
    @FXML
    private Button button22;
    @FXML
    private ImageView circle00;
    @FXML
    private ImageView circle01;
    @FXML
    private ImageView circle02;
    @FXML
    private ImageView circle10;
    @FXML
    private ImageView circle11;
    @FXML
    private ImageView circle12;
    @FXML
    private ImageView circle20;
    @FXML
    private ImageView circle21;
    @FXML
    private ImageView circle22;

    @FXML
    private ImageView cross00;
    @FXML
    private ImageView cross01;
    @FXML
    private ImageView cross02;
    @FXML
    private ImageView cross10;
    @FXML
    private ImageView cross11;
    @FXML
    private ImageView cross12;
    @FXML
    private ImageView cross20;
    @FXML
    private ImageView cross21;
    @FXML
    private ImageView cross22;

    @FXML
    private Line row0;
    @FXML
    private Line row1;
    @FXML
    private Line row2;
    @FXML
    private Line column0;
    @FXML
    private Line column1;
    @FXML
    private Line column2;
    @FXML
    private Line cros1;
    @FXML
    private Line cros2;

    @FXML
    private Label win;
    @FXML
    private Label lose;

    private Stage stage;
    private Scene scene;
    private Parent root;
    private Game game = new Game();

    public void finalResult(boolean bool){
        if(bool){
            win.setVisible(true);
        }
        else{
            lose.setVisible(true);
        }
    }



    public void enemyChoice(int pair){
        switch (pair) {
            case 0:
                button00.setVisible(false);
                cross00.setVisible(true);
                game.updateBoard(0,0,"x");
                game.viewBoard();
                if(!checkWin(game.check())) finalResult(false);
                break;
            case 1:
                button01.setVisible(false);
                cross01.setVisible(true);
                game.updateBoard(0,1,"x");
                game.viewBoard();
                if(!checkWin(game.check())) finalResult(false);
                break;
            case 2:
                button02.setVisible(false);
                cross02.setVisible(true);
                game.updateBoard(0,2,"x");
                game.viewBoard();
                if(!checkWin(game.check())) finalResult(false);
                break;
            case 10:
                button10.setVisible(false);
                cross10.setVisible(true);
                game.updateBoard(1,0,"x");
                game.viewBoard();
                if(!checkWin(game.check())) finalResult(false);
                break;
            case 11:
                button11.setVisible(false);
                cross11.setVisible(true);
                game.updateBoard(1,1,"x");
                game.viewBoard();
                if(!checkWin(game.check())) finalResult(false);
                break;
            case 12:
                button12.setVisible(false);
                cross12.setVisible(true);
                game.updateBoard(1,2,"x");
                game.viewBoard();
                if(!checkWin(game.check())) finalResult(false);
                break;
            case 20:
                button20.setVisible(false);
                cross20.setVisible(true);
                game.updateBoard(2,0,"x");
                game.viewBoard();
                if(!checkWin(game.check())) finalResult(false);
                break;
            case 21:
                button21.setVisible(false);
                cross21.setVisible(true);
                game.updateBoard(2,1,"x");
                game.viewBoard();
                if(!checkWin(game.check())) finalResult(false);
                break;
            case 22:
                button22.setVisible(false);
                cross22.setVisible(true);
                game.updateBoard(2,2,"x");
                game.viewBoard();
                if(!checkWin(game.check())) finalResult(false);
                break;
        }
    }

    private void offAllButtons(){
        if(button00.isVisible()) button00.setVisible(false);
        if(button01.isVisible()) button01.setVisible(false);
        if(button02.isVisible()) button02.setVisible(false);
        if(button10.isVisible()) button10.setVisible(false);
        if(button11.isVisible()) button11.setVisible(false);
        if(button12.isVisible()) button12.setVisible(false);
        if(button20.isVisible()) button20.setVisible(false);
        if(button21.isVisible()) button21.setVisible(false);
        if(button22.isVisible()) button22.setVisible(false);
    }

    public boolean checkWin(int number){
        if(number != 8) offAllButtons();
        switch (number){
            case 0:
                row0.setVisible(true);
                offAllButtons();
                return false;
            case 1:
                row1.setVisible(true);
                offAllButtons();
                return false;
            case 2:
                row2.setVisible(true);
                offAllButtons();
                return false;
            case 3:
                column0.setVisible(true);
                offAllButtons();
                return false;
            case 4:
                column1.setVisible(true);
                offAllButtons();
                return false;
            case 5:
                column2.setVisible(true);
                offAllButtons();
                return false;
            case 6:
                cros1.setVisible(true);
                offAllButtons();
                return false;
            case 7:
                cros2.setVisible(true);
                offAllButtons();
                return false;
        }
        return true;
    }

    public void clickOnButton00(){
        button00.setVisible(false);
        circle00.setVisible(true);
        game.updateBoard(0,0,"o");
        game.viewBoard();
        if(checkWin(game.check())) this.enemyChoice(game.nextTurn(game.getBoard()));
        else finalResult(true);
    }
    public void clickOnButton01(){

        button01.setVisible(false);
        circle01.setVisible(true);
        game.updateBoard(0,1,"o");
        game.viewBoard();
        if(checkWin(game.check())) this.enemyChoice(game.nextTurn(game.getBoard()));
        else finalResult(true);
    }
    public void clickOnButton02(){

        button02.setVisible(false);
        circle02.setVisible(true);
        game.updateBoard(0,2,"o");
        game.viewBoard();
        if(checkWin(game.check())) this.enemyChoice(game.nextTurn(game.getBoard()));
        else finalResult(true);
    }
    public void clickOnButton10(){

        button10.setVisible(false);
        circle10.setVisible(true);
        game.updateBoard(1,0,"o");
        game.viewBoard();
        if(checkWin(game.check())) this.enemyChoice(game.nextTurn(game.getBoard()));
        else finalResult(true);
    }
    public void clickOnButton11(){

        button11.setVisible(false);
        circle11.setVisible(true);
        game.updateBoard(1,1,"o");
        game.viewBoard();
        if(checkWin(game.check())) this.enemyChoice(game.nextTurn(game.getBoard()));
        else finalResult(true);
    }
    public void clickOnButton12(){

        button12.setVisible(false);
        circle12.setVisible(true);
        game.updateBoard(1,2,"o");
        game.viewBoard();
        if(checkWin(game.check())) this.enemyChoice(game.nextTurn(game.getBoard()));
        else finalResult(true);
    }
    public void clickOnButton20(){

        button20.setVisible(false);
        circle20.setVisible(true);
        game.updateBoard(2,0,"o");
        game.viewBoard();
        if(checkWin(game.check())) this.enemyChoice(game.nextTurn(game.getBoard()));
        else finalResult(true);
    }
    public void clickOnButton21(){

        button21.setVisible(false);
        circle21.setVisible(true);
        game.updateBoard(2,1,"o");
        game.viewBoard();
        if(checkWin(game.check())) this.enemyChoice(game.nextTurn(game.getBoard()));
        else finalResult(true);
    }
    public void clickOnButton22(){

        button22.setVisible(false);
        circle22.setVisible(true);
        game.updateBoard(2,2,"o");
        game.viewBoard();
        if(checkWin(game.check())) this.enemyChoice(game.nextTurn(game.getBoard()));
        else finalResult(true);
    }
    public void switchToMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getClassLoader().getResource("fxmls/SceneMenu.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToGame(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getClassLoader().getResource("fxmls/SceneGame.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void exitGame(){
        Platform.exit();
    }
}
