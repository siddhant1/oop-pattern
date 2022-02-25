package com.siddhant.iterator;

public class IteratorTest {
    public void main(){
        BrowserHistory<Integer> history = new BrowserHistory<>();
        history.push(1);
        history.push(2);

        Iterator<Integer> it = history.createIterator();

        while (it.hasNext()){
            System.out.println(it.current());
            it.next();
        }
    }
}
