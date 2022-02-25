package com.siddhant.state;

public class Cursor implements ToolType {

    @Override
    public void mouseUp() {
        System.out.println("Moving Cursor up");
    }

    @Override
    public void mouseDown() {
        System.out.println("Moving Cursor down");
    }
}
