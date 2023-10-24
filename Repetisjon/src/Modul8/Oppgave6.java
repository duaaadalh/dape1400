package Modul8;

public class Oppgave6 {
    public static void main (String [] args){

        int [] liste = {1,2,3,4,5,6,7,8};
        int [] liste1 = {1,2,3,4,5,6,7,8};

        if (liste1.length != liste.length){
            System.out.println("De er ikke like lange og dermed ikke like");
        }
        else {
            boolean like = true;
            for (int i = 0; i < liste1.length; i++){
                if (liste1[i] != liste[i]){
                    like = false;
                }
            }
            if (like){
                System.out.println("De er like");
            }
            else {
                System.out.println("De er ikke like");
            }
        }

    }
}
