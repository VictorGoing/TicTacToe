package com.example.game;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private final Image imageback = new Image("file:src/main/resources/Images/Background.png");
    private final Image circle = new Image("file:src/main/resources/Images/Circle.png");
    private FlowPane circles = new FlowPane(Orientation.HORIZONTAL);

    @Override
    public void start(Stage primaryStage) throws IOException {

        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();

        grid.setBackground(background);

        Scene scene = new Scene(grid, 800, 600);

        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
