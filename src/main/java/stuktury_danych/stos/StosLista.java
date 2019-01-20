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
        int value = top.getValue();
        top = top.getPrev();

    }

    public int peek(){
        return top.getValue();
    }
    
}