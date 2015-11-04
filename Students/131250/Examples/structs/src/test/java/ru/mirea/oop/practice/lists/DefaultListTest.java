package ru.mirea.oop.practice.lists;

import org.junit.Before;

public abstract class DefaultListTest {
    protected ILinkedList<Integer> list;

    @Before
    public void setUp() throws Exception {
        list = new LinkedListImpl<>();
        list.add(0);
        list.add(9);
        list.add(7);
        list.add(8);
        list.add(6);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(5);
    }
}
