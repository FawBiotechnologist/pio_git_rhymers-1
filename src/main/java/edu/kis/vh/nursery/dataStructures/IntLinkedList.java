package edu.kis.vh.nursery.dataStructures;

import edu.kis.vh.nursery.Stacks;

public class IntLinkedList implements Stacks {

    private Node last;

    private void push(int i) {
        if (last == null) last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    private boolean isEmpty() {
        return last == null;
    }

    private int top() {
        if (isEmpty()) return ERR_NO;
        return last.getValue();
    }

    private int pop() {
        if (isEmpty()) return ERR_NO;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    @Override
    public void countIn(int in) {
        push(in);
    }

    @Override
    public boolean callCheck() {
        return isEmpty();
    }

    public boolean isFull() {
        return false;
    }

    @Override
    public int peekaboo() {
        return top();
    }

    @Override
    public int countOut() {
        return pop();
    }

}
