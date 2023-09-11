package bank1;

public class konto {
    private String personnummer;
    private String navn;
    private double saldo;

    public konto(String personnummer, String navn, double saldo){
        this.personnummer = personnummer;
        this.navn = navn;
        this.saldo = saldo;
    }

    public String getPersonnummer(){
        return personnummer;
    }

    public String getNavn(){
        return navn;
    }

    public void setPersonnummer(String personnummer){
        this.personnummer = personnummer;
    }

    public void setNavn(String navn){
        this.navn = navn;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
