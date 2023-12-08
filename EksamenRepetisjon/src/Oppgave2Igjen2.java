public class Oppgave2Igjen2 {


    public static boolean tallFunnet (int [] liste, int tall){
        for (int tallet : liste){
            if (tallet == tall){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int liste [] = new int [10];
        liste[0] = 40;
        liste[1] = 12;
        liste[2] = 13;
        liste[3] = 15;

        boolean funnet = tallFunnet(liste, 5);
            if (funnet){
                System.out.println("funnet");
            }
            else {
                System.out.println("ikke funnet");
            }
        }


    }

