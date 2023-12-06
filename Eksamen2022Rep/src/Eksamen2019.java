import java.util.Arrays;

class Trekning{

    public static int[] vinnere (){

        int tall1 = (int )(Math.random() * 34 + 1);
        int tall2 = (int )(Math.random() * 34 + 1);
        int tall3 = (int )(Math.random() * 34 + 1);
        int tall4 = (int )(Math.random() * 34 + 1);
        int tall5 = (int )(Math.random() * 34 + 1);
        int tall6 = (int )(Math.random() * 34 + 1);
        int tall7 = (int )(Math.random() * 34 + 1);


        int [] liste = {tall1, tall2, tall3, tall4, tall5, tall6, tall7};

        Arrays.sort(liste);



        return liste;

    }

}



public class Eksamen2019 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Trekning.vinnere()));

    }
}
