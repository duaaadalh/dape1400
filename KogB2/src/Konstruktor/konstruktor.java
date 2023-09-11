package Konstruktor;


class Bil{
    private String farge;
    private int HK;

    // det nedenfor er en konstruktør

    public Bil(String farge, int HK){
        this.farge = farge;
        this.HK = HK;
    }

    public void setFarge(String farge){
        this.farge = farge;
    }
    public String getFarge(){
        return farge;
    }

    public void setHK(int HK){
        if (HK>0){
            this.HK = HK;
        }
    }
    public int getHK(){
        return HK;
    }
}



public class konstruktor {
    public static void main(String[] args) {
        // slik at man direkte kan putte dem nedenfor
        Bil volvo = new Bil("Rød", 234);
        int HK = volvo.getHK();
        String farge = volvo.getFarge();
        System.out.println("Bilens farge er "+ farge+ "."+ " Den har "+ HK+ " HK.");

    }
}