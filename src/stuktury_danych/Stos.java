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
        // int value = tab[top
        // top--;
        // return value;
        return tab[top--];
    }
    pubic boolean isEmpty() {
        return top ==-1;
    }
     

}
