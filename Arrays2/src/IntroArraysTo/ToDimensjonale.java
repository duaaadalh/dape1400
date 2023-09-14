package IntroArraysTo;

public class ToDimensjonale {

    public static void main(String[] args){
        int [][] tabell = new int[4][4];
        tabell[0][0] = 23;
        tabell[0][2] = 24;
        tabell[2][3] = 45;

        for (int i = 0; i < tabell.length; i++){
            for (int j = 0; j < tabell[i].length; j++){
                System.out.print(tabell[i][j]);
            }
        }
    }
}
