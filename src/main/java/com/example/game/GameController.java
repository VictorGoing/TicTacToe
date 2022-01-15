package com.example.game;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
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


    private Stage stage;
    private Scene scene;
    private Parent root;
    private Game game = new Game();


    public void clickOnButton00(){
        button00.setVisible(false);
        circle00.setVisible(true);
        game.updateBoard(0,0,"o");
        game.viewBoard();
    }
    public void clickOnButton01(){

        button01.setVisible(false);
        circle01.setVisible(true);
        game.updateBoard(0,1,"o");
        game.viewBoard();
    }
    public void clickOnButton02(){

        button02.setVisible(false);
        circle02.setVisible(true);
        game.updateBoard(0,2,"o");
        game.viewBoard();
    }
    public void clickOnButton10(){

        button10.setVisible(false);
        circle10.setVisible(true);
        game.updateBoard(1,0,"o");
        game.viewBoard();
    }
    public void clickOnButton11(){

        button11.setVisible(false);
        circle11.setVisible(true);
        game.updateBoard(1,1,"o");
        game.viewBoard();
    }
    public void clickOnButton12(){

        button12.setVisible(false);
        circle12.setVisible(true);
        game.updateBoard(1,2,"o");
        game.viewBoard();
    }
    public void clickOnButton20(){

        button20.setVisible(false);
        circle20.setVisible(true);
        game.updateBoard(2,0,"o");
        game.viewBoard();
    }
    public void clickOnButton21(){

        button21.setVisible(false);
        circle21.setVisible(true);
        game.updateBoard(2,1,"o");
        game.viewBoard();
    }
    public void clickOnButton22(){

        button22.setVisible(false);
        circle22.setVisible(true);
        game.updateBoard(2,2,"o");
        game.viewBoard();
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
