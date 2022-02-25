package com.siddhant.state;

public class Canvas {


    ToolType currentTool;

    public ToolType getCurrentTool(){
        return this.currentTool;
    }

    public void setCurrentTool(ToolType tool){
        this.currentTool = tool;
    }

    public void draw(){
        currentTool.mouseDown();
        currentTool.mouseUp();
    }
}
