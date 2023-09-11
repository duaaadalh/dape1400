package bank1;

public class bank1 {

    public static void main (String[] args) {
        konto sparekonto = new konto("12345678910", "Duaa Adnan", 1000);
        konto lonnskonto = new konto("12345678910","Duaa Adnan", 0);
        sparekonto.setSaldo(2000);
        lonnskonto.setSaldo(1000);
        System.out.println("Sparekontoen tilhører "+ sparekonto.getNavn());
        System.out.println("Saldoen til denne er nå "+ sparekonto.getSaldo()+ " kroner");
        System.out.println("Saldoen til lønnskontoen er "+ lonnskonto.getSaldo()+ " kroner");

    }
}
