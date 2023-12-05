import java.util.ArrayList;

class Bok{
    private String tittel;
    private String forfatter;
    private double pris;

    public Bok(String tittel, String forfatter, double pris){
        this.forfatter = forfatter;
        this.tittel = tittel;
        this.pris = pris;
    }

    public String toString(){
        return "Tittelen er: " + tittel + ". Forfatteren er: " + forfatter + ". Prisen er: " + pris;
    }
}

class Lydbok extends Bok{
    private int lengdeminutter;
    public Lydbok (String forfatter, String tittel, double pris, int lengdeminutter){
        super(forfatter, tittel, pris);
        this.lengdeminutter = lengdeminutter;
    }
    public String toString(){
        return ". Lengdeminutter " + lengdeminutter;
    }
}

class Papirbok extends Bok{
    private String ISBN;
    public Papirbok(String forfatter, String tittel, double pris, String ISBN){
        super(forfatter, tittel, pris);
        this.ISBN = ISBN;
    }
    public String toString(){
        return ". ISBN: " + ISBN;
    }
}




public class oppgave5 {
    public static void main(String[] args) {
        ArrayList<Bok> bokSamling = new ArrayList<>();
        Lydbok enLydbok = new Lydbok("Duaa", "Simone", 235.5, 230);
        Papirbok enPapirbok = new Papirbok("Duaa", "Simone", 2345.5,"84759875");
        bokSamling.add(enPapirbok);
        bokSamling.add(enLydbok);
        for (Bok enBok : bokSamling){
            System.out.println(enBok);
        }
    }

}
