import stuktury_danych.stos.StosLista;

public class Stosy {

    public static void wywolajStos() {
        StosLista stosLista = new StosLista();
        stosLista.push(1);
        stosLista.push(2);
        stosLista.push(3);
        stosLista.print();
        stosLista.pop();
        stosLista.pop();
        stosLista.pop();

        stosLista.push(4);
        stosLista.push(1);
        stosLista.push(6);

        System.out.println("peek:" + stosLista.peek());
        stosLista.pop();
        System.out.println("peek" + stosLista.peek());
        stosLista.print();
    }

    public static void main(String[] args) {
        wywolajStos();
    }
}
