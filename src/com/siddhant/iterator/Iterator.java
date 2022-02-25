package com.siddhant.iterator;

public interface Iterator<T> {
    public void next();
    public boolean hasNext();
    public T current();
}
