package ramile1;

public class Oppgave1igjen {
    public static void main(String[] args) {

        int liste [] =  {-3,41,5,-3,2,49};

        int teller = 0;
        int sum = 0;
        for (int i : liste){
            if (i > 0){
                sum += i;
                teller ++;
            }
        }

        System.out.println(sum);

        double gjennomsnitt =  sum/ (double) teller;

        System.out.println(gjennomsnitt);


    }
}
