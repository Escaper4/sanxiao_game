package com.sanxiao;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class GameBoard extends Pane {
    private static final int GRID_SIZE = 8; // 8x8的游戏网格
    private static final int BLOCK_SIZE = 60; // 每个方块的大小
    private Block[][] blocks; // 存储所有方块

    public GameBoard() {
        blocks = new Block[GRID_SIZE][GRID_SIZE];
        initializeBoard();
    }

    private void initializeBoard() {
        // 创建游戏网格
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                Block block = new Block(row, col);
                blocks[row][col] = block;
                
                // 设置方块位置
                block.setLayoutX(col * BLOCK_SIZE);
                block.setLayoutY(row * BLOCK_SIZE);
                
                getChildren().add(block);
            }
        }
    }
} 