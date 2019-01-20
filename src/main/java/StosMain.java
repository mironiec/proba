import java.util.Scanner;

import stuktury_danych.*;

public class StosMain {

    public static void wywowalStosTab() {
        Stos StosTab = new Stos(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy");
        int size = scanner.nextInt();

        while (true) {
            System.out.println("Podaj operacje: " +
                    "1. push()" +
                    "2. pop()" +
                    "3. peek()" +
                    "4. print()" +
                    "5. wyjscie"
            );

            int num = scanner.nextInt();//numer operacji

            switch (num) {
                case 1:
                    System.out.println("Podaj wartosc");
                    int value = scanner.nextInt();
                    StosTab.push(value);
                    break;

                case 2:
                    System.out.println(StosTab.pop());
                    break;

                case 3:
                    System.out.println(StosTab.peek());
                    break;

                case 4:
                    StosTab.print();
                    break;

                case 0:
                    return;
            }


        }


    }

    public static void main(String[] args) {

        wywowalStosTab();

    }

}