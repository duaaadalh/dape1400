public class Oppgave1 {

    public static void main(String[] args) {
        int list [] = {-3, 45, 5, -3, 2, 49};

        int teller = 0;
        for (int i : list){
            if (i > 10){
                teller++;
            }
        }

        System.out.println(teller);

    }




}
