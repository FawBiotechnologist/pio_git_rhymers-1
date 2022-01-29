package edu.kis.vh.nursery;

public class IntArrayStack {
    private static final int SIZE = 12;
    private static final int TOTAL_START = -1;
    private final int[] numbers = new int[SIZE];
    private static final int ERR_NO = -1;
    private int total = TOTAL_START;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull()) numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL_START;
    }

    public boolean isFull() {
        return total == SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck()) return ERR_NO;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck()) return ERR_NO;
        return numbers[total--];
    }
}
