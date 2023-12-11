public class Oppgave1 {

    public static void main(String[] args) {



        int sum = 0;
        for (int i = 0; i <= 1000; i+=10){
            sum +=i;

        }
        System.out.println(sum);

        sum = 0;
        int i = 0;

        while (i <= 1000){
            sum +=i;
            i+=10;
        }
        System.out.println(sum);

        for (int j = 10;  j>=-10; j--){
            if (j != -10){
                System.out.print(j + ",");
            }
            else {
                System.out.print(j);
            }
        }



    }
}
