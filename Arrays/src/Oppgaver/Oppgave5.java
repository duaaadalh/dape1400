package Oppgaver;

public class Oppgave5 {
    public static void main(String[] args) {
        int liste[] = {45, 34, 5, 8, 10, 2, 13, 25};
        int minsteTall = min(liste);
        int makstall = max(liste);
        System.out.println("Minste tall " + minsteTall);
        System.out.println("Største tall " + makstall);
    }

    public static int min(int[] liste) {
        int minste = liste[0];
        for (int tall : liste) {
            if (tall < minste) {
                minste = tall;
            }
        }
        return minste;

    }

    public static int max(int[] liste) {
        int maks = liste[0];
        for (int tall : liste) {
            if (tall > maks) {
                maks = tall;
            }
        }
        return maks;

    }
}