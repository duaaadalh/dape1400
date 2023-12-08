import java.util.ArrayList;

class Personalia{
    private String navn;
    private String adresse;
    private String telefonnr;

    public Personalia(String navn, String adresse, String telefonnr){
        this.adresse = adresse;
        this.navn = navn;
        this.telefonnr = telefonnr;
    }

    @Override
    public String toString() {
        return "navn: " + navn+ ", adresse: " + adresse +", telefonnummer: " + telefonnr;
    }
}


class Student{
    private String studentNummer;
    private Personalia personalia;
    public Student(Personalia personalia, String studentNummer){
        this.studentNummer = studentNummer;
        this.personalia = personalia;
    }

    @Override
    public String toString() {
        return   "Student: " +
                "personalia=" + personalia +
                ", studentnr= " + studentNummer ;
    }

}

class Ansatt {
    private String tittel;
    private Personalia personalia;
    public Ansatt (Personalia personalia, String tittel){

        this.tittel = tittel;
        this.personalia = personalia;
    }

    @Override
    public String toString() {
        return "Ansatt: " +
                "personalia=" + personalia +
                ", tittel= " + tittel ;
    }
    }








public class Oppgave3 {
    public static void main(String[] args) {
        Personalia Ramile = new Personalia("Ramile Parhat", "Osloveien 82", "45423918");
        Personalia Duaa = new Personalia("Duaa Hamid", "Osloveien 83", "45423919");
        Ansatt RamilePar = new Ansatt(Ramile, "Lektor");
        Student DuaaHa = new Student(Duaa, "s876538");
        System.out.println(RamilePar);
        System.out.println(DuaaHa);

    }
}
