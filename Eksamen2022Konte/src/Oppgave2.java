import java.util.ArrayList;

class Valuta{
    private String valuta;
    private double kurs;
    public Valuta(String valuta, double kurs) {
        this.valuta = valuta;
        this.kurs = kurs;
    }
    public String getValuta() {
        return valuta;
    }
    public double getKurs() {
        return kurs;
    }
}

class ValutaKalkulator {
    private ArrayList<Valuta> valutakurser = new ArrayList<>();
    public ValutaKalkulator(){
       Valuta US = new Valuta("Dollar", 10);
       valutakurser.add(US);
       Valuta DK = new Valuta("Danske kroner", 8);
       valutakurser.add(DK);

    }
    public double beregnKurs(String valuta) {

        for (Valuta kurs : valutakurser){
            if (kurs.getValuta().equals(valuta)){
                return kurs.getKurs();
            }
        }
    return 0;
    }
}




public class Oppgave2 {
    public static void main(String[] args) {
        ValutaKalkulator k = new ValutaKalkulator();


    }
}
