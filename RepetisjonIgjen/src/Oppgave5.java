import java.util.ArrayList;

class Bok{
        private String tittel;
        private String forfatter;
        private double pris;

        public Bok (String tittel, String forfatter, double pris){
            this.tittel = tittel;
            this.forfatter = forfatter;
            this.pris = pris;
        }

        public String toString(){
            return "Tittel= " + tittel + " Forfatter= " + forfatter + " Prisen= " + pris;
        }

    }

    class Lydbok extends Bok{
        private int lengdeMinutter;
       public Lydbok (String tittel, String forfatter, double pris, int lengdeMinutter){
           super(tittel, forfatter, pris);
            this.lengdeMinutter = lengdeMinutter;
        }
        public String toString(){
           return " Lengdeminutter= " + lengdeMinutter;
        }


    }

    class Papirbok extends Bok{
        private String ISBN;
        public Papirbok (String tittel, String forfatter, String ISBN, double pris){
            super(tittel, forfatter, pris);
            this.ISBN = ISBN;
        }
        public String toString(){
            return " ISBN= " + ISBN;
        }
    }


    public class Oppgave5 {
    public static void main(String[] args){
        ArrayList <Bok> bokSamling = new ArrayList<>();
        Lydbok enLydbok = new Lydbok("Marihønen" , "Simone", 512.00, 1305);
        Papirbok enPapirbok = new Papirbok("Blåbær", "Duaa", "13468394295", 432.87);
        bokSamling.add(enPapirbok);
        bokSamling.add(enLydbok);
        for (Bok enBok : bokSamling){
            System.out.println(enBok);
        }


    }
}
