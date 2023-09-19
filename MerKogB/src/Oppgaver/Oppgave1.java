package Oppgaver;

class Dato {
    private int dag, måned, år;

    public Dato(int dag, int måned, int år) {
        this.dag = dag;
        this.måned = måned;
        this.år = år;
    }

    private static String månedsnavn(int mnd) {
        String[] navn = { "januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember" };
        if (mnd > 0 && mnd < 13)
            return navn[mnd - 1];
        else
            return "ukjent måned";
    }

    public String toString() {
        return dag + ". " + månedsnavn(måned) + " " + år;
    }
}

class Bil {
    private String typebetegnelse;
    private Dato førstegangsregistrert;
    private String kjennetegn;

    public Bil(String typebetegnelse, Dato førstegangsregistrert, String kjennetegn) {
        this.typebetegnelse = typebetegnelse;
        this.førstegangsregistrert = førstegangsregistrert;
        this.kjennetegn = kjennetegn;
    }

    public String toString() {
        return "Type: " + typebetegnelse + "\nFørstegangsregistrert: " + førstegangsregistrert + "\nKjennetegn: " + kjennetegn;
    }
}

public class Oppgave1 {
    public static void main(String[] args) {
        // Opprett et array av Biler
        Bil[] motorvognregister = new Bil[3]; // Endre størrelsen etter behov

        // Sett inn noen biler i arrayet
        motorvognregister[0] = new Bil("Audi A6", new Dato(1, 5, 2020), "ABC123");
        motorvognregister[1] = new Bil("Toyota Corolla", new Dato(15, 8, 2019), "XYZ789");
        motorvognregister[2] = new Bil("Ford Focus", new Dato(10, 2, 2022), "DEF456");

        // List motorvognregisteret (arrayet) ved hjelp av en løkke
        for (int i = 0; i < motorvognregister.length; i++) {
            System.out.println("Bil #" + (i + 1) + "\n" + motorvognregister[i] + "\n");
        }
    }
}


