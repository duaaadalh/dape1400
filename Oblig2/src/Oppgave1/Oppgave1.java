package Oppgave1;

public class Oppgave1 { // klasse
    public void summerTall(int tall1, int tall2){ // metode som tar to heltall, og printer ut alle tallene melloom og summen av dem
        int j = 0; // initierer summen av heltallene
        for (int i = tall1; i <= tall2; i++){ // looper gjennom alle heltallene mellom tall1 og tall2
            System.out.print(i); // i hver loop: printer ut tallet
            j += i; // i hver loop: legger til tallet i summen
            if (i == tall2){ // hvis vi er på siste tall
                System.out.print("="); // print ut =
                System.out.print(j); // print ut sum

            }
            else { // hvis vi ikke er ved siste tall
                System.out.print("+"); // print ut +

            }

        }
        

    }

    public static void main (String [] args){
        Oppgave1 sum = new Oppgave1();
        sum.summerTall(3,5);
    }
}



