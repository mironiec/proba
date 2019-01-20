package stuktury_danych;

public class Tablice {

    public static void piszParzyste (int[] tab) {
        for (int i = tab.length - 1; i >= 0; i--) {
            if (i % 2 == 0) System.out.println(tab[i]);
        }
    }

    public static void podzielnePrzezTrzy(int[] tab) {
        int suma = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 3 == 0) suma = suma + tab[i];
        }
        System.out.println(suma);
    }

    public static void sumaPieciuMinusSzesc(int[] tab) {
        int suma = 0;

        for (int i = 0; i<5; i++) {
            suma = suma + tab[i];
            if (i==4) suma = suma - tab[5];

        }


        System.out.println(suma);
    }

}
