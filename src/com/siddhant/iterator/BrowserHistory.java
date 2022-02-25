package com.siddhant.iterator;

import java.util.Stack;

public class BrowserHistory<T> {

    private final Stack<T> urls = new Stack<>();

    public Stack<T> getUrls() {
        return urls;
    }

    public void push(T url){
        urls.push(url);
    }

    public T pop(){
        return urls.pop();
    }

    public Iterator<T> createIterator(){
        return new ListIterator<>(this);
    }
}
