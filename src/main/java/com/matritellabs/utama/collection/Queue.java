package com.matritellabs.utama.collection;

public interface Queue {

    boolean add(Object e);

    Object element();

    boolean offer(Object e);

    Object peek();

    Object poll();

    Object remove();


}
