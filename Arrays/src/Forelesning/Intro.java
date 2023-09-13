package Forelesning;

public class Intro {
    public static void main(String[] args){
        int [] liste = new int[4];
        liste[0] = 23;
        liste[1] = 2;
        liste[2] = -4;
        liste[3] = 5;
        String ut = "Her kommer tallene i listen: ";
        ut += liste[0] + " ";
        ut += liste[1] + " ";
        ut += liste[2] + " ";
        ut += liste[3] + " ";
        System.out.println(ut);
        //alternativt med en løkke

        for (int i = 0; i < liste.length; i++){
            System.out.print(liste[i]+ " ");
        }

    }

}

//En alternativ måte å initialisere Arrayet på er allerede i opprettelsen (instansieringen) :

/*   int[] liste = {23,2,-4,5};
  String ut = "Her er tallene i listen : ";
   for (int i = 0; i < liste.length; i++){
      ut += liste[i]+" ";
  }
  System.out.println(ut);
*/