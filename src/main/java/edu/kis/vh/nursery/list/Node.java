package edu.kis.vh.nursery.list;

public class Node {

    private final int value;
    private Node prev;
    private Node next;

    /*
        w obrębie naszego projektu no modifier jest wystarczajacym modyfikatorem dla tych getterow/setterow
        w szerszej perspektywie te metody powinny być publiczne, ale polecenie nie specyfikuje jaki zakres dostepu ma
        byc zostawiony więc zostawiam najmniejszy możliwy dla tego projektu :)
    */

    Node(int i) {
        value = i;
    }

    int getValue() {
        return value;
    }

    Node getPrev() {
        return prev;
    }

    void setPrev(Node prev) {
        this.prev = prev;
    }

    Node getNext() {
        return next;
    }

    void setNext(Node next) {
        this.next = next;
    }
}
