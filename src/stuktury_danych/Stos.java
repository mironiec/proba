package stuktury_danych;

public class Stos {

    private int[] tab;

    private int top = -1;

    public  StosTab(int size) {
        tab = new int[size];
    }

    public void push(int value) {
        tab[++top] = value;
    }

    public int pop() {
        // int value = tab[top]
        // top--;
        // return value;
        return tab[top--];
    }
    pubic boolean isEmpty() {
        return top == -1;
    }

    public int peek() {
        return tab[top];
    }

    public void print() {
        for (int i=0; i<= top; i++) { System.out.printl(tab[i] + " "); }
        System.out.println();
    }

}
