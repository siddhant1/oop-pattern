package com.siddhant.memento;


import java.util.Stack;

public class History {
    public Stack<Memento> states = new Stack<>();


    public void push(Memento state){
        states.push(state);
    }

    public Memento pop(){
       return states.pop();
    }
}
