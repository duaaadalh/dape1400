package Intro;

class Ansatt2{

    private String navn;
    private double lønn;

    public Ansatt2(String navn,double lønn) {
        this.navn = navn;
        this.lønn = lønn;
    }

    public String getNavn(){
        return this.navn;
    }

    public double getLønn(){
        return this.lønn;
    }

}

class Selger extends Ansatt2{

    private static final double bonus = 30_000;

    public Selger(String navn, double lønn) {
        super(navn, lønn);
    }

    public double getLønn(){
        return super.getLønn()+bonus;
    }
}

class Montør extends Ansatt2{

    public Montør(String navn, double lønn) {
        super(navn, lønn);
    }
}


public class Polyformisme {
    public static void main(String[] args) {

        Ansatt2 Selger1 = new Selger("Per Hansen",400_000);
        Ansatt2 Montør1 = new Montør("Ole Olsen",300_000);

        Ansatt2[] liste = new Ansatt2[10];
        liste[0] = Selger1;
        liste[1] = Montør1;

        for (int i=0;i<liste.length && liste[i]!=null;i++){
            System.out.println(liste[i].getNavn()+" tjener "+liste[i].getLønn());
        }
    }
}
