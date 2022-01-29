package edu.kis.vh.nursery;

import edu.kis.vh.nursery.dataStructures.IntArrayStack;

public class DefaultCountingOutRhymer {
    /*Pytanie: Jakie są konsekwencje zmiany omówionej w poprzednim punkcie?
     zmiana poniższej zmiennej na typ interfejsu oznacza, ze nasz default rhymer może teraz przyjąć dowolny
    obiekt który implementuje ten interfejs co pozwala nam na łatwą i szybką modyfikację sposobu implementacji
    bez konieczności wprowadzania zmian w tej klasie
    */
    Stacks intArrayStack;

    public DefaultCountingOutRhymer() {
        this.intArrayStack = new IntArrayStack();
    }

    public DefaultCountingOutRhymer(Stacks intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

//    public int getTotal() {
//        return intArrayStack.getTotal();
//    }


    public void countIn(int in) {
        intArrayStack.countIn(in);
    }


    public boolean callCheck() {
        return intArrayStack.callCheck();
    }


    public boolean isFull() {
        return intArrayStack.isFull();
    }


    public int peekaboo() {
        return intArrayStack.peekaboo();
    }


    public int countOut() {
        return intArrayStack.countOut();
    }

}
