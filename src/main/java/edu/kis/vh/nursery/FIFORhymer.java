package edu.kis.vh.nursery;

import edu.kis.vh.nursery.dataStructures.IntArrayStack;
import edu.kis.vh.nursery.dataStructures.IntLinkedList;

/**
 * FIFO based implementation of Rhymer
 */
public class FIFORhymer extends DefaultCountingOutRhymer {
    /*Pytanie: Jaki wybór będzie najlepszy (napisz komentarz)?
    * Uważam, że wybór implementacji na linked liście będzie korzystniejszy ponieważ jest to struktura dynamiczna
    * i nieważne jak użytkownik/innny programista chciałbym wykorzystać tę klasę (dla jak dużego setu danych)
    * będzie to możliwe podczas gdy w implementacji tablicowej mamy z góry nałożony limit
    *
    *
    * */
    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer(new IntLinkedList());

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
