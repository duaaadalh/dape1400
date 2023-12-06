import java.util.ArrayList;

class Bok2{
    private String tittel;
    private String forfatter;
    private double pris;

    public Bok2(String tittel, String forfatter, double pris){
        this.forfatter = forfatter;
        this.tittel = tittel;
        this.pris = pris;
    }

    public String toString(){
        return "Forfatter= " + forfatter + ", Tittel= " + tittel + ", Prisen= " + pris;
    }

}

class Lydbok2 extends Bok2{
    private int lengdeminutter;
    public Lydbok2(String forfatter, String titel, double pris, int lengdeminutter){
        super(forfatter, titel, pris);
        this.lengdeminutter = lengdeminutter;
    }

    @Override
    public String toString() {
        return super.toString() + " Lengdeminutter " + lengdeminutter;
    }
}

class Papirbok2 extends Bok2{
    private int ISBN;
    public Papirbok2(String forfatter, String tittel, double pris, int ISBN){
        super(forfatter, tittel, pris);
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return super.toString() + " ISBN= " + ISBN;
    }
}



public class Oppgave5igjen {
    public static void main(String[] args) {
        ArrayList<Bok2> enBokSamling = new ArrayList<>();
        Papirbok2 nyPapirbok = new Papirbok2("Ramile", "Duaa", 345.6, 345534);
        Lydbok2 nyLydbok = new Lydbok2("Duaa", "Ramile", 523.52, 923);
        enBokSamling.add(nyLydbok);
        enBokSamling.add(nyPapirbok);
        for (Bok2 enBOKEN : enBokSamling){
            System.out.println(enBOKEN);
        }

    }
}
