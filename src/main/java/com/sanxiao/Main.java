package com.sanxiao;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("三消小游戏");
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        
        // 创建游戏主界面
        GameBoard gameBoard = new GameBoard();
        Scene scene = new Scene(gameBoard);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
} 