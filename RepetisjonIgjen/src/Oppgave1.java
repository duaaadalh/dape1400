public class Oppgave1 {

    public static void main(String[] args) {
        int list [] = {-3, 41, 5, -3, 2, 49};

        int teller = 0;
        for (int i : list){
            if (i > 10){
                teller++;
            }
        }

        System.out.println(teller);


        for (int i = 0; i < list.length; i +=2){
            System.out.println(list[i]);
        }

        int positiv = 0;
        int sum = 0;
        for (int i : list){
            if (i>0){
                sum += i;
                positiv++;
            }
        }

        System.out.println(sum);

        double gjennomsnitt = (double) sum / positiv;
        System.out.println(gjennomsnitt);

    }




}
