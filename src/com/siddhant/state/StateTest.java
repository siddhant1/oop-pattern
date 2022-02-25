package com.siddhant.state;

public class StateTest {
    public void main(){
        Canvas canvas = new Canvas();

        canvas.setCurrentTool(new Eraser());
        canvas.draw();

        canvas.setCurrentTool(new Cursor());
        canvas.draw();
    }
}
