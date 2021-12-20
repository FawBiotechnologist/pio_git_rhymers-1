package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int size = 12;
    private static final int totalStart = -1;
    private final int[] numbers = new int[size];

    private int total = totalStart;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == totalStart;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return totalStart;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return totalStart;
        return numbers[total--];
    }

}
