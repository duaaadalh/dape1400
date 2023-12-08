public class Oppgave1 {


    public static void main(String[] args) {

        int sum = 0;
        int teller = 0;
        for (int i = 5; i <=100; i+=5){
            sum += i;
            teller++;
        }

        System.out.println(sum);
        double gjennomsnitt = sum / (double) teller;
        System.out.println(gjennomsnitt);

       int j = 5;
       int sum1 = 0;
       int teller1 = 0;
       while (j <= 100){
           sum1 += j;
           teller1++;
           j +=5;
       }
       System.out.println(sum);

       double gjennomsnitt1 = sum1/ (double) teller1;
       System.out.println(gjennomsnitt1);

    }
}
