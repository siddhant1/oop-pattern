package com.siddhant.memento;

public class MementoTest {

    public void main() {
        Document document = new Document();
        History history = new History();

        document.setContent("Hello");
        history.push(document.createSnapshot());

        document.setFontName("Font 1");
        history.push(document.createSnapshot());

        document.setFontSize(10);

        System.out.println(document);

        document.setSnapshot(history.pop());
        System.out.println(document);

        document.setSnapshot(history.pop());
        System.out.println(document);

        System.out.println(document);
    }
}
