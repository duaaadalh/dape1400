
class Fag{
    private String navn;
    private String år;
    private Student [] studenter;

    public Fag(String navn, String år, Student [] studenter){
        this.navn = navn;
        this.år = år;
        this.studenter = studenter;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setStudenter(Student[] studenter) {
        this.studenter = studenter;
    }

    public Student[] getStudenter() {
        return studenter;
    }

    public void setÅr(String år) {
        this.år = år;
    }

    public String getÅr() {
        return år;
    }

    public String toString(){
        String ut = "Fag: " + navn + ", år " + år + "\n";
        for (Student enStudent : studenter){
            if (enStudent !=null){
                ut += enStudent + "\n";
            }
        }
        return ut;
 }


}

class Student{
    private String navn;
    private String studNr;

    public Student (String navn, String studnr){
        this.navn = navn;
        this.studNr = studnr;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setStudNr(String studNr) {
        this.studNr = studNr;
    }

    public String getStudNr() {
        return studNr;
    }

   public String toString(){
        return "Student: " + "Navn: " + navn + " studentnummer: " +studNr;
    }
}



public class Oppgave3 {
    public static void main(String[] args) {
        Student [] liste = new Student[10];
        Student Duaa = new Student("Duaa" , "87432");
        Student Ramile = new Student("Ramile", "532895729");
        Fag programmering = new Fag("Programmering", "2023", liste);
        liste[0] = Ramile;
        liste[1] = Duaa;
        System.out.println(programmering);


    }

}
