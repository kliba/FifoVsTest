package com.matritellabs.utama.collection;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class FifoQueue implements Queue {

    public static LinkedList<Object> ourList = new LinkedList();

    @Override
    public boolean add(Object e) {
        ourList.add(e);
        if (ourList.contains(e)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object element() {
        Object o = new Object();
        if (ourList.contains(o)) {
            return ourList.element();
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public boolean offer(Object e) {
        ourList.add(e);
        if (ourList.contains(e)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object peek() {
        Object o = new Object();
        if (ourList.isEmpty()) {
            return null;
        } else {
            return ourList.contains(o);
        }
    }

    @Override
    public Object poll() {
        Object o = new Object();
        if (ourList.isEmpty()) {
            return null;
        } else {
            return ourList.remove(o);
        }
    }

    @Override
    public Object remove() {
        Object o = new Object();
        if (ourList.contains(o)) {
            ourList.remove(o);
            return o;
        } else {
            throw new NoSuchElementException();
        }

    }
}