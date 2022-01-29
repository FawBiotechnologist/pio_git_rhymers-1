package edu.kis.vh.nursery;

public interface Stacks {
    //Pytanie: Czy pomogła Ci w tym realizacja poprzedniego podpunktu?
    // Tak wystarczylo wprowadzic zmianę w interfejsie aby odzwierciedlic ją we wszystkich klasach implementujacych
    //ten interfejs i korzystajacych z tej zmiennej

    //Pytanie: Wspólny interfejs hierarchii implementacji to …?
    //korzeń hierarchii implementacji i w moim przypadku jest to interfejs Stacks
    int ERR_NO = 0;

    void countIn(int in);

    boolean callCheck();

    boolean isFull();

    int peekaboo();

    int countOut();
}
