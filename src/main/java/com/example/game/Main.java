package com.example.game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private final Image imageback = new Image("file:src/main/resources/Images/Background.png");
    private final Image circle = new Image("file:src/main/resources/Images/Circle.png");

    private final FlowPane circles1 = new FlowPane(Orientation.HORIZONTAL);
    private final FlowPane circles2 = new FlowPane(Orientation.HORIZONTAL);
    private final FlowPane circles3 = new FlowPane(Orientation.HORIZONTAL);

    @Override
    public void start(Stage primaryStage) throws IOException {

        try{
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxmls/SceneMenu.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch (NullPointerException e) {
            e.printStackTrace();
        }

        /*//Background
        BackgroundSize backgroundSize = new BackgroundSize(800, 600, false, false, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        //Buttons
        Button newbtn = new Button();
        newbtn.setText("Start!");
        newbtn.setOnAction((e) -> {
            chooseSide();
        });

        Button exitbtn = new Button();
        exitbtn.setText("Koniec");
        exitbtn.setOnAction(e -> Platform.exit());


        GridPane grid = new GridPane();
        grid.isResizable();
        grid.setPadding(new Insets(170, 100, 100, 200));
        *//*grid.setMaxSize(45,45);
        grid.setPrefSize(40, 40);
        grid.setMinSize(35,35);*//*

        int rowCount = 3;
        int columnCount = 4;

        RowConstraints rc = new RowConstraints();
        rc.setPercentHeight(100d / rowCount);

        for (int i = 0; i < rowCount; i++) {
            grid.getRowConstraints().add(rc);
        }

        ColumnConstraints cc = new ColumnConstraints();
        cc.setPercentWidth(100d / columnCount);

        for (int i = 0; i < columnCount; i++) {
            grid.getColumnConstraints().add(cc);
        }

        grid.setBackground(background);

        javafx.scene.control.Label label = new javafx.scene.control.Label("SIEEEEEEEMA!");
        label.setFont(javafx.scene.text.Font.font("Comic Sans", FontWeight.BOLD, 22));


        ImageView img = new ImageView(circle);
        ImageView img2 = new ImageView(circle);
        ImageView img3 = new ImageView(circle);

        circles1.getChildren().add(img);
        circles2.getChildren().add(img2);
        circles3.getChildren().add(img3);

        //grid.add(label, 0, 0, 3, 1);
        grid.add(circles1, 0, 0, 1, 1);
        grid.add(circles2, 1, 1, 1, 1);
        grid.add(circles3, 2, 2, 1, 1);
        grid.add(newbtn, 4, 0, 1, 1);
        grid.add(exitbtn, 4, 1, 1, 1);
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(1);
        grid.setVgap(30);
        Scene scene = new Scene(grid, 800, 600);
        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();*/
    }



    public void chooseSide(){
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getClassLoader().getResource("src/main/resources/fxmls/chooseWindow.fxml"));
            Stage stage = new Stage();
            stage.setTitle("My New Stage Title");
            stage.setScene(new Scene(root, 450, 450));
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
