package com.sanxiao;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Block extends Rectangle {
    private static final int SIZE = 60;
    private static final Color[] COLORS = {
        Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.PURPLE
    };
    
    private int row;
    private int col;
    private Color color;

    public Block(int row, int col) {
        super(SIZE, SIZE);
        this.row = row;
        this.col = col;
        
        // 随机选择颜色
        this.color = COLORS[(int) (Math.random() * COLORS.length)];
        setFill(color);
        
        // 设置方块样式
        setStroke(Color.BLACK);
        setStrokeWidth(2);
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Color getColor() {
        return color;
    }
} 