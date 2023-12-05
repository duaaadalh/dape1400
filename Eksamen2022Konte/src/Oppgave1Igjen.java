public class Oppgave1Igjen {


    public static void main(String[] args) {

        for (int i = 0; i < 100; i +=3){
            System.out.print(i + " ");
        }


        int sum = 0;
        int antall = 0;
        int tall = 2;

        while (tall <= 100){
            sum += 100;
            tall += 2;
            antall++;

        }
        double gjennomsnitt = sum / (double) antall;

    }
}
