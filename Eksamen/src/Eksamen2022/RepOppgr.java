package Eksamen2022;

public class RepOppgr {
    public static void main(String[] args){

        int liste [] = {-3, 41, 5, -3, 2, 49};
        int teller  = 0;
        for (int i : liste){
            if (i > 10){
                teller++;
            }
        }
        System.out.println("Antall tall større enn ti er " + teller);


        

    }
}
