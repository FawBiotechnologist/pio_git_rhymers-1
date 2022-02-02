package edu.kis.vh.nursery;

import edu.kis.vh.nursery.dataStructures.IntArrayStack;

public class DefaultCountingOutRhymer {
    /*Pytanie: Jakie są konsekwencje zmiany omówionej w poprzednim punkcie?
     zmiana poniższej zmiennej na typ interfejsu oznacza, ze nasz default rhymer może teraz przyjąć dowolny
    obiekt który implementuje ten interfejs co pozwala nam na łatwą i szybką modyfikację sposobu implementacji
    bez konieczności wprowadzania zmian w tej klasie
    */
    private final Stacks stackImplementation;

    public DefaultCountingOutRhymer() {
        this.stackImplementation = new IntArrayStack();
    }

    public DefaultCountingOutRhymer(Stacks stackImplementation) {
        this.stackImplementation = stackImplementation;
    }
//unused function depending on project future it may or may not be deleted
//    public int getTotal() {
//        return intArrayStack.getTotal();
//    }


    public void countIn(int in) {
        stackImplementation.countIn(in);
    }


    public boolean callCheck() {
        return stackImplementation.callCheck();
    }


    public boolean isFull() {
        return stackImplementation.isFull();
    }


    public int peekaboo() {
        return stackImplementation.peekaboo();
    }


    public int countOut() {
        return stackImplementation.countOut();
    }

}
