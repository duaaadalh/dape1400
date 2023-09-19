package Intro;



class Person2 {
    public String personnummer;
    public String navn;
    public String adresse;
    public String telefonnr;

    public String toString(){
        String ut = "Her er inneholdet i objektet:\n";
        ut+= "Personnummer : "+this.personnummer+"\n";
        ut+= "Navn : "+this.navn+"\n";
        ut+= "Adresse : "+this.adresse+"\n";
        ut+= "Telefonnummer : "+this.telefonnr+"\n";
        return ut;
    }
}

public class Intro2 {
    public static void main(String[] args){
        Person2 enPerson = new Person2();
        enPerson.personnummer="01234567891";
        enPerson.navn = "Marius";
        enPerson.adresse = "Osloveien 82";
        enPerson.telefonnr = "99887766";
        System.out.println(enPerson);

    }
}
