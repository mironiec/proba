
public class Struktury {


    public static void main(String[] args) {
        int[] tab = new int[10];
        for (int i = 0; i < 9; i++) tab[i] = i+1;

        tablice.piszParzyste(tab);

        tablice.podzielnePrzezTrzy(tab);

        tablice.sumaPieciuMinusSzesc(tab);
    }
}
