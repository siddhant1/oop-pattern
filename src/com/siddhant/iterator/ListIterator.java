package com.siddhant.iterator;

public class ListIterator<T> implements Iterator<T> {

    BrowserHistory<T> history;
    int currentIndex = 0;
    public ListIterator(BrowserHistory<T> history) {
        this.history = history;
    }

    @Override
    public void next() {
        currentIndex++;
    }

    @Override
    public boolean hasNext() {
        return this.currentIndex < history.getUrls().size();
    }

    @Override
    public T current() {
        return this.history.getUrls().get(currentIndex);
    }
}
