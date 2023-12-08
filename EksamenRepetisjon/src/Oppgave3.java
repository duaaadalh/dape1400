import java.util.ArrayList;

class Person{
    private String navn;
    private String adresse;
    private String telefonnr;

    public Person(String navn, String adresse, String telefonnr){
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    public String toString(){
        return "Navn: " + navn + " Adresse:" + adresse + " Telefonnummer: " +telefonnr;
    }

}

class Student extends Person {
    private String studienr;
    private String studienavn;

    public Student(String navn, String adresse, String telefonnr, String studienr, String studienavn) {
        super(navn, adresse, telefonnr);
        this.studienr = studienr;
        this.studienavn = studienavn;

    }

    @Override
    public String toString() {
        return super.toString() + " Studienummer:" + studienr + " Studienavn: " + studienavn;

    }
}

    class Ansatt extends Person{
        private String instituttNavn;
        private double lonn;

        public Ansatt(String navn, String adresse, String telefonnr, String instituttNavn, double lonn){
            super(navn, adresse, telefonnr);
            this.instituttNavn = instituttNavn;
            this.lonn = lonn;
        }

        @Override
        public String toString() {
            return super.toString() + " Instituttnavn: " + instituttNavn + " Lønn: " + lonn;
        }
    }




    public class Oppgave3 {


    public static void main(String[] args) {
        ArrayList<Person> Personalia = new ArrayList<>();
        Student Ramile = new Student("Ramile", "Osloveien1", "98754323", "74286", "IT");
        Ansatt Tor = new Ansatt("Tor", "Osloveien3", "8956348925", "Institutt IT", 789654);
        Personalia.add(Ramile);
        Personalia.add(Tor);
        for (Person enPerson : Personalia){
            System.out.println(enPerson);
        }





    }
}
