package stuktury_danych.stos;

public class StosLista {

    private StosElem top;

    public StosLista() {
        top = null;
    }
    public void push(int value) {
        top = new StosElem(value, top);  //nowy top z starego topu

    }

    public int pop() {
        if (isEmpty()) {throw new StosListaOutOfIndex("Pusty stos!");
        int value = top.getValue();
        top = top.getPrev();
        return value;
    }

    public int peek(){
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void print() {
        StosElem tmpElem = top;
        while (tmpElem != null) {
            System.out.println(tmpElem.getValue() + " ");
            tmpElem = tmpElem.getPrev();
        }
        System.out.println();
    }
}
