public class Oppgave1 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i <= 1000; i += 10) {
            sum += i;

            System.out.println(sum);
        }

        sum = 0;
        int i = 0;

        while (i <= 1000) {
            sum += i;
            i += 10;

        }

        System.out.println(sum);


        for (int k = 10; k >= -10; k--) {
            if (k != -10) {
                System.out.print(k + ",");
            } else {

                System.out.println(k);


            }
        }
    }

}