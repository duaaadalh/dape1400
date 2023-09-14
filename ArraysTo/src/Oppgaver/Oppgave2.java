package Oppgaver;

import java.util.ArrayList;

public class Oppgave2 {
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
        tallListe.add(10);
        tallListe.add(11);

        // enten kan man gjøre dette: Da fjerner man ut ifra posisjonen i listen
       // tallListe.remove(2);
        //tallListe.remove(1);

        // eller slik, ved å fjerne verdiene uten å måtte lete selv etter posisjonen i listen

        tallListe.remove(Integer.valueOf(2));
        tallListe.remove(Integer.valueOf(3));


        System.out.println("Elementer i arraylist: ");
        for (int i = 0;i < tallListe.size(); i++) {

            System.out.println(tallListe.get(i));
        }




    }
}
