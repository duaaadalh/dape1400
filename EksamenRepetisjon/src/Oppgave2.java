public class Oppgave2 {


    public static boolean funnetTall(int[] liste, int tall) {
        for (int tallet : liste) {
            if (tallet == tall) {
                return true;

            }
        }
        return false;

    }


    public static void main(String[] args) {
        int[] liste = new int[10];
        liste[0] = 4;
        liste[1] = 5;
        liste[2] = 8;
        liste[3] = 19;
        liste[4] = 23;
        liste[5] = 1234;
        liste[6] = 13;
        liste[7] = 15;
        liste[8] = 18;
        liste[9] = 12;
        boolean funnet = funnetTall(liste, 13);
        if (funnet) {
            System.out.println("Funnet");
        } else {
            System.out.println("Ikke funnet");


        }


    }
}





