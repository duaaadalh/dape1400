import java.util.ArrayList;

class Personen{

    private String navn;
    private String personNummer;
    private int alder;

    public Personen(String navn, String personNummer, int alder){
        this.navn = navn;
        this.personNummer = personNummer;
        this.alder = alder;
    }

    public String toString(){
        return "Person: " + "\n" + "Navnet: " + navn + "\n" + "Personnummeret: " + personNummer + "\n" + "Alderen:" +alder + "\n";
    }

}

class Pasient extends Personen{
    private String diagnose;

    public Pasient(String navn, String personNummer, int alder, String diagnose){
        super(navn, personNummer, alder);
        this.diagnose = diagnose;
    }

    @Override
    public String toString() {
        return  "Pasient: " + "\n" + super.toString()+ "Diagnose: " + diagnose + "\n";
    }
}

class Lege extends Personen{
    public Pasient [] pasienter = new Pasient[100];
    public Lege(String navn, String personNummer, int alder){
        super(navn,personNummer,alder);
    }

    @Override
    public String toString() {
        String ut = " ";
        for (Pasient enPasient : pasienter){
            if (enPasient != null){
                ut += enPasient;
            }
        }
        return "Lege: " + "\n"+
                super.toString() + ut;

    }
}



public class Oppgave5 {
    public static void main(String[] args) {
        Pasient Linda = new Pasient("Linda", "13050065437", 25, "Hodepine");
        Pasient Simone = new Pasient("Simone", "05120087463", 23, "Mageknipe");
        Lege Vanja = new Lege("Vanja", "22099746285", 26);
        Vanja.pasienter[0] = Linda;
        Vanja.pasienter[1] = Simone;
        System.out.println(Vanja);


    }
}
