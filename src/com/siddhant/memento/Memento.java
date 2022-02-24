package com.siddhant.memento;

public class Memento {


    private final String content;
    private final String fontName;
    private final int fontSize;


    public String getContent() {
        return content;
    }

    public int getFontSize() {
        return fontSize;
    }

    public String getFontName() {
        return fontName;
    }

    public Memento(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }
}
