package ramile1;
import java.util.ArrayList;


        class Bok{
            private String forfatter;
            private String tittel;
            private double pris;

            public Bok(String tittel, String forfatter, double pris){
                this.forfatter = forfatter;
                this.tittel = tittel;
                this.pris = pris;
            }

            public String toString(){
               return "Tittel= " +  tittel + " Forfatter= " + forfatter + " Prisen= " + pris;
            }

        }

        class Lydbok extends Bok{
            private int lengdeMinutter;
            public Lydbok(String tittel, String forfatter, double pris, int lengdeminutter){
                super(tittel, forfatter, pris);
                this.lengdeMinutter = lengdeminutter;
            }

            public String toString(){
                return super.toString() + " Lengdeminutt= " + lengdeMinutter;
            }


        }

        class Papirbok extends Bok{
            private String ISBN;
            public Papirbok(String tittel, String forfatter, double pris, String ISBN){
                super(tittel, forfatter, pris);
                this.ISBN = ISBN;
            }
        }

public class Oppgave5 {
    public static void main(String[] args){

          ArrayList<Bok> boksamling = new ArrayList<>();
          Lydbok enLydbok = new Lydbok("Skolen", "Duaa", 234.67, 230);
          Papirbok enPapirbok = new Papirbok("Biblioteket", "Ramile", 349.80, "123456789");
          boksamling.add(enLydbok);
          boksamling.add(enPapirbok);
          for (Bok enBok : boksamling){
              System.out.println(enBok);
          }





    }
}
