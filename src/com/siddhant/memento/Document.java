package com.siddhant.memento;

public class Document {
    private String content;
    private String fontName;
    private int fontSize;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public Memento createSnapshot(){
        return new Memento(this.content,this.fontName,this.fontSize);
    }

    public void setSnapshot(Memento snap){
        this.setFontSize(snap.getFontSize());
        this.setContent(snap.getContent());
        this.setFontName(snap.getFontName());
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}
