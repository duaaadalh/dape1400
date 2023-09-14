package Oppgaver;

import java.util.ArrayList;

public class Oppgave4 {
    public static void main(String[] args){
        ArrayList<Integer> tallListe = new ArrayList <Integer>();
        tallListe.add(1);
        tallListe.add(2);
        tallListe.add(3);
        tallListe.add(4);
        tallListe.add(5);
        tallListe.add(6);
        tallListe.add(7);
        tallListe.add(8);
        tallListe.add(9);

        Integer [] intArray = new Integer[tallListe.size()];
        tallListe.toArray(intArray);

        for (Integer integer : intArray){
            System.out.println(integer);
        }
    }
}
