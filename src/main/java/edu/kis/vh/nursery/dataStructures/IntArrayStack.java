package edu.kis.vh.nursery.dataStructures;

import edu.kis.vh.nursery.Stacks;

public class IntArrayStack implements Stacks {
    private static final int SIZE = 12;
    private static final int TOTAL_START = -1;
    private final int[] numbers = new int[SIZE];
    private int total = TOTAL_START;
// unused function depending on project future it may or may not be deleted
//    public int getTotal() {
//        return total;
//    }

    public void countIn(int in) {
        if (!isFull()) numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL_START;
    }

    public boolean isFull() {
        return total == SIZE - 1;
    }

    public int peekaboo() {
        if (callCheck()) return ERR_NO;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck()) return ERR_NO;
        return numbers[total--];
    }
}
