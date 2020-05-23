package com.orkun.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
