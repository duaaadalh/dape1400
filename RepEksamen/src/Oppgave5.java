import java.util.ArrayList;

class Bok{
    private String forfatter;
    private String tittel;
    private double pris;

    public Bok(String forfatter, String tittel, double pris){
        this.forfatter = forfatter;
        this.tittel = tittel;
        this.pris = pris;
    }

    @Override
    public String toString() {
        return "Forfatter: " + forfatter + " Tittel: " + tittel + " Prisen: " + pris;

    }
}

    class Papirbok extends Bok{
    private int ISBN;

    public Papirbok(String forfatter, String tittel, double pris, int ISBN){
        super(forfatter, tittel, pris);
        this.ISBN = ISBN;
    }

        @Override
        public String toString() {
            return super.toString() + " ISBN "+ ISBN;
        }
    }

    class Lydbok extends Bok{
    private int lengdeMinutter;

    public Lydbok(String forfatter, String tittel, double pris, int lengdeMinutter){
        super(forfatter, tittel, pris);
        this.lengdeMinutter = lengdeMinutter;
    }

        @Override
        public String toString() {
            return super.toString() + " Lengdeminutter: " + lengdeMinutter;
        }
    }


public class Oppgave5 {
    public static void main(String[] args) {
        ArrayList<Bok> bokSamling = new ArrayList<>();
        Papirbok enPapirbok = new Papirbok("Karsten", "Mastergraden", 1503, 123954342);
        Lydbok enLydbok = new Lydbok("Duaa", "Bachelorgraden", 1305, 1234);
        bokSamling.add(enLydbok);
        bokSamling.add(enPapirbok);
        for (Bok bøkene : bokSamling){
            System.out.println(bøkene);
        }

    }
}
