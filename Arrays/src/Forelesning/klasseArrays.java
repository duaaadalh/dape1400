package Forelesning;

import java.util.Arrays;


public class klasseArrays {
    public static void main(String[] args) {
        double [] liste1 = {1.2,3.5,2.6,-3.6,5.6,10};

        Arrays.sort(liste1);

        for (double tall : liste1){
            System.out.print(tall+" ");
        }

        double [] liste2 = Arrays.copyOf(liste1, liste1.length);

        double [] liste3 = liste2;

        boolean b = Arrays.equals(liste2, liste1);

        int location = Arrays.binarySearch(liste1, 5.6);

        System.out.println("\n Indeksen til tallet 5.6 er :"+location);
    }

}
