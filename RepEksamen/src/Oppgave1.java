public class Oppgave1 {

    public static void main(String[] args) {


        int [] liste = {-3, 41, 5, -3, 2, 49};

        int teller = 0;
        for (int i : liste){
            if (i > 10){
                teller++;
            }
        }
       System.out.println("Antall tall som er større enn 10 er: " + teller);


        for (int i = 0; i < liste.length; i+=2){
          System.out.println("Annethvert tall er: "+liste[i]);

        }

        int teller1 = 0;
        int positiv = 0;


      for (int i : liste){
          if (i > 0){
              positiv += i;
              teller1++;
          }

      }
        System.out.println(positiv);
        double gjennomsnitt = positiv / (double) teller1;
        System.out.println(gjennomsnitt);

    }
}
