public class Oppgave1 {

    public static void main(String[] args) {
        int liste [] = {-3, 41, 5, -3, 2, 49};

        int teller = 0;
        for (int i : liste){
            if (i > 10){
                teller++;
            }
        }
        System.out.println(teller);


        for (int i = 0; i < liste.length; i +=2){
        System.out.println(liste[i]);
        }

        teller = 0;
        int sum = 0;

        for (int i : liste){
            if (i > 0){
                sum += i;
                teller++;
            }
        }

        double gjennomsnitt = (double) sum / teller;
        System.out.println(sum);
        System.out.println(gjennomsnitt);



    }
}
