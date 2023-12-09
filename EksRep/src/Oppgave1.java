public class Oppgave1 {

    public static void main(String[] args) {

        int [] liste = {20, 34, -4, 4, 5, 11, -23};

        for (int i = 0; i < liste.length; i++){
            System.out.print(liste[i] + " ");
        }


        for (int j = liste.length-1; j >=0; j--){
            System.out.print(liste[j] + " ");
        }

        int sum = 0;
        for (int k = 0; k < liste.length; k++){
            sum+= liste[k];
        }
        System.out.println(sum);

        int teller = 0;
        sum = 0;

        for (int l = 0; l < liste.length; l++){
            sum += liste[l];
            teller++;
        }

        double gjennomsnitt = sum / (double) teller;
        System.out.println(gjennomsnitt);

        for (int m = 0; m < liste.length; m++){
            if (liste[m] > 0 && liste[m] < 20){
                System.out.println(liste[m]);
            }
        }


        }

    }



