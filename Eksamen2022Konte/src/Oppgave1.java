public class Oppgave1 {

    public static void main(String[] args) {


        for (int i = 0; i < 100; i +=3){
            i++;
            System.out.print(i + " ");
        }

        int sum = 2;
        int antall = 0;
        int tall = 2;

        while (tall <= 100){
            sum += 100;
            tall += 2;
            antall++;
        }
        double gjennomsnitt = (double) sum / antall;

        System.out.println(gjennomsnitt);




    }
}