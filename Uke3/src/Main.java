import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    public static void main(String[] args){


     //oppgave 1

     String navn;
     String alderNo;
     String oretNo;
     String fodsel;
     String orEt;
     String alderEt;
     String yrke;


     navn = "Per Olsen";
     alderNo = "32";
     oretNo = "2018";
     fodsel = "1986";
     orEt = "2053";
     alderEt = "67";
     yrke = "pensjonist";

     //String innForNavn = showInputDialog("Skriv inn navnet");
     //String innForAlderNo = showInputDialog("Skriv inn alder");
     //String innForOretNo = showInputDialog("Skriv inn året vi er i");
     //String innForFodsel = showInputDialog("Skriv inn året han er født");
     //String innForAlderEt = showInputDialog("Skriv inn alderen hans i 2053");
     //String innForOrEt = showInputDialog("Skriv inn året senere");
     //String innForYrke = showInputDialog("Skriv inn yrket i 2053");

     //String ut = innForNavn + " er i dag "+ innForAlderNo + " år. "+ "Han er født i "+innForFodsel + ". "+ "I "+ innForOrEt + " er han "+ innForAlderEt + " år"+ " og da vil han være "+ innForYrke;
     //showMessageDialog(null, ut);


    //Oppgave 2

    int antall = 0;

    while (antall <= 10) {
        if (antall % 2 ==0) {
    System.out.println(antall);
        }
        antall +=2;
    }



// Oppgave 3

   double bredde;
   double lengde;

  //String innForBredde = JOptionPane.showInputDialog("Skriv inn bredden");
 // String innForLengde = JOptionPane.showInputDialog("Skriv inn lengden");


   //bredde = Double.parseDouble(innForBredde);
   //lengde = Double.parseDouble(innForLengde);

   //double areal = bredde*lengde;

   //JOptionPane.showMessageDialog(null, "En rektangel med bredde "+ bredde + " cm" + " og en lengde "+ lengde+ " cm "+ "har et areal på "+ areal+ " cm^2.");

   // Oppgave 4

       // double radius;
       // double omkrets;


       // String innForRadius = JOptionPane.showInputDialog("Radiusen er");
        //radius = Double.parseDouble(innForRadius);


        //omkrets = radius * 2 * 3.14;

       // String omkretsString = String.format("%.2f", omkrets);

       // showMessageDialog(null, "Omkretsen av en sirkel med "+ radius+ " cm"+" som radius blir "+omkretsString+ "cm" );

    //Oppgave 5


      //  double farenheit;
       // double celsius;

        //String innForFarenheit = JOptionPane.showInputDialog("Skriv inn farenheit");
        //farenheit = Double.parseDouble(innForFarenheit);
        //celsius = (farenheit-32)/1.8;
       // showMessageDialog(null, "Celsius når farenheit er "+ innForFarenheit+ " grader er "+ celsius+ " grader" );
       // System.out.println(celsius);


        //Oppgave 6

      //  double norskeKroner;
     //   double valutakurs = 10.36;

       // String innForAmerikanskDollar = JOptionPane.showInputDialog("Skriv inn antall amerikanske dollar");
       // double amerikanskDollar = Double.parseDouble(innForAmerikanskDollar);


      //  norskeKroner = amerikanskDollar * valutakurs;

       // JOptionPane.showMessageDialog(null, "Amerikanske dollar i norske kroner: "+ norskeKroner);


        //Oppgave 7

      //  int antallPizza;
      //  int antallPersoner;
      //  int antallSlicesPerPizza;


      //  String innForAntallPizza = JOptionPane.showInputDialog("Skriv inn antall pizza");
       // String innForAntallPersoner = JOptionPane.showInputDialog("Skriv inn antall personer");
       // String innForSlicesPerPizza = JOptionPane.showInputDialog("Skriv inn antall slices per pizza");

       // antallPersoner = Integer.parseInt(innForAntallPersoner);
       // antallPizza = Integer.parseInt(innForAntallPizza);
      //  antallSlicesPerPizza = Integer.parseInt(innForSlicesPerPizza);

       // int totalSlices = antallPizza*antallSlicesPerPizza;
       // int slicesPerPerson = totalSlices/antallPersoner;
       // int slicesTilOvers = totalSlices%antallPersoner;

       // JOptionPane.showMessageDialog(null, "Dersom man er "+ antallPersoner+ " personer og har "+ antallPizza+ " pizza, får hver person "+ slicesPerPerson+ " slices "+ slicesTilOvers+ " blir til overs" );


    // Oppgave 10

       int alder;

       String innForAlder = JOptionPane.showInputDialog("Skriv inn alder");
       alder = Integer.parseInt(innForAlder);

        if (alder >= 18) {
            JOptionPane.showMessageDialog(null, "Du kan ta førekort for bil da du er gammel nok");
        }
        if (alder <= 18){
            JOptionPane.showMessageDialog(null, "Du er for ung til å ta førerkort for bil");

        }


        //Oppgave 11

       // 1. lag en JOption.pane som tar i mot tall som string
        // 2. finn lengden av stringen
        // 3. lag en for loop som looper for lengden av strengen
        // 4. før for loopen, deklarer en int med verdi lik 0
        // 5. inn i for loopen, finn den n bokstaven i stringen og konverter til int
        // 6. legg til int på 4.
        // 7. skriv ut int fra 4.

        String tall1 = JOptionPane.showInputDialog("Skriv inn tall");
        int tall = Integer.parseInt(tall1);

        int tallLengde= tall1.length();

        int tverrSum = 0;
        for (int i = 0; i < tallLengde; i++){
           String tall3 = String.valueOf(tall1.charAt(i));
           int intTall3 = Integer.parseInt(tall3);
           tverrSum += intTall3;
        }

        System.out.println("Fmjau " + Integer.toString(tverrSum));



    }
}






