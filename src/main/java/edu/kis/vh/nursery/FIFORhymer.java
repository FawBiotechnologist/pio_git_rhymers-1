package edu.kis.vh.nursery;

/**
 * FIFO based implementation of Rhymer
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    public FIFORhymer() {
    }

    public FIFORhymer(Stacks stackImplementation) {
        super(stackImplementation);
    }

    /**
     * @return method returns element from queue
     */
    @Override
    public int countOut() {
        while (!callCheck())

            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())

            countIn(temp.countOut());

        return ret;
    }
}
