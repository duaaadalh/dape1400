import java.sql.Date;
import java.util.ArrayList;

class Ansatt{
    public String navn;
    public Date født;
    public Date tiltrådt;

    public Ansatt(String navn, Date født, Date tiltrådt){
        this.navn = navn;
        this.født = født;
        this.tiltrådt = tiltrådt;
    }

    @Override
    public String toString() {
        return "Navnet: " + navn + " Fødseldato: " + født + " Dato tiltrådt: " + tiltrådt;
    }
}


class Dato {
    private int dag, måned, år;

    public Dato(int dag, int måned, int år) {
        this.dag = dag;
        this.måned = måned;
        this.år = år;
    }

    private static String månedsnavn(int mnd) {
        String[] navn = {"januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember"};
        if (mnd > 0 && mnd < 13)
            return navn[mnd - 1];
        else
            return "ukjent måned";


    }

    @Override
    public String toString() {
        return "Dato{" +
                "dag=" + dag +
                ", måned=" + måned +
                ", år=" + år +
                '}';
    }
}



public class Oppgave4 {
    public static void main(String[] args) {
        ArrayList<Ansatt> Stab = new ArrayList<>();
        Dato Dato1 = new Dato(15,03,1997);
        Dato Dato2 = new Dato(13,05,2000);
        Ansatt ansatt1 = new Ansatt("Karsten", Dato1, Dato2);
        Dato dato3 =  new Dato(12,12,2000);
        Dato dato4 = new Dato(18, 05, 1999);
        Ansatt ansatt2 = new Ansatt("Duaa", dato3,dato4);
        Stab.add(ansatt1);
        Stab.add(ansatt2);

        for (Ansatt enAnsatt : Stab){
            System.out.println(enAnsatt);
        }

    }
}
