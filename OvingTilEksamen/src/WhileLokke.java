

public class WhileLokke {

    public static void main(String[] args) {


       int i = 0;
       int sum = 0;
       int antall = 0;
       while (i < 100){
           System.out.println(i);
           sum +=i;
           i+=2;
           antall++;

       }
       System.out.print(sum + " ");
       double gjennomsnitt = sum / (double) antall;

       System.out.println(gjennomsnitt);







    }


}
