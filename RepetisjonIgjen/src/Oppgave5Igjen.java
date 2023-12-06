import java.util.ArrayList;

class Bok1{
    private String tittel;
    private String forfatter;
    private double pris;

    public Bok1(String tittel, String forfatter, double pris){
        this.forfatter = forfatter;
        this.tittel = tittel;
        this.pris = pris;
    }

    public String toString(){
        return "Tittel= " + tittel + " Forfatter= " + forfatter + " Prisen=" + pris;
    }
}

class LydBoken extends Bok1{
    private int lengdeMinutter;
    public LydBoken (String forfatter, String tittel, double pris, int lengdeMinutter){
        super(tittel,forfatter,pris);
        this.lengdeMinutter = lengdeMinutter;
    }
    public String toString(){
        return super.toString()+" Lengdeminutter= " + lengdeMinutter;
    }
}

class PapirBok1 extends Bok1{
    private String ISBN;
    public PapirBok1(String forfatter, String tittel, String ISBN, double pris){
        super(tittel,forfatter,pris);
        this.ISBN = ISBN;
    }

    public String toString(){
        return super.toString()+ " ISBN= " + ISBN;
    }
}






public class Oppgave5Igjen {

    public static void main(String[] args) {
        ArrayList<Bok1> bokSamling1 = new ArrayList<>();
        LydBoken enLydboken = new LydBoken("Simome", "Diaa", 423, 423);
        PapirBok1 enPapirboken = new PapirBok1("Duaa", "simone", "89236528956", 432.4);
        bokSamling1.add(enPapirboken);
        bokSamling1.add(enLydboken);
        for (Bok1 enBokene : bokSamling1){
            System.out.println(enBokene);
        }



    }
}
