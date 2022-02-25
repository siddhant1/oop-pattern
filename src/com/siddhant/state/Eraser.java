package com.siddhant.state;

public class Eraser implements ToolType {

        @Override
        public void mouseUp() {
            System.out.println("Moving Eraser Up");
        }

        @Override
        public void mouseDown() {
            System.out.println("Moving Eraser Down");
        }
}
