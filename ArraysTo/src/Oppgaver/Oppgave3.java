package Oppgaver;
import java.util.ArrayList;
import java.util.Arrays;

public class Oppgave3 {
    public static void main(String[] args){
        int liste [] = {1,2,3,4,5,6,7,8,9};

        ArrayList<Integer> listeArrayList = new ArrayList<>();
        for (int tall : liste){
            listeArrayList.add(tall);
        }

        System.out.println("Arraylisten er: ");
        for (Integer tall : listeArrayList){
            System.out.println(tall);
        }

    }
}
