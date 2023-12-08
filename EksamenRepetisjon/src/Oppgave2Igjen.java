
public class Oppgave2Igjen {

    public static boolean tallFunnet (int [] liste, int tall){
        for (int tallet : liste){
            if (tallet == tall){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int liste [] = new int[10];
        liste[0] = 13;
        liste [1] = 14;
        liste[2] = 37;
        liste [3] = 12;

        boolean funnet = tallFunnet(liste, 13);
        if (funnet){
            System.out.println("funnet");
        }
        else {
            System.out.println("Ikke funnet");
        }


    }
}
