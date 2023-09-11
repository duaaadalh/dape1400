package Oppgaver;


class BensinKjop{
    private String sted;
    private String typeBensin;
    private double literFylt;
    private double prLiter;
    private String tidspunktFylt;

    public BensinKjop(String sted, String typeBensin, double literFylt, double prLiter, String tidspunktFylt){
        this.sted = sted;
        this.typeBensin = typeBensin;
        this.literFylt = literFylt;
        this.prLiter = prLiter;
        this.tidspunktFylt = tidspunktFylt;


    }

    public String getSted(){
        return sted;
    }

    public void setSted(String sted) {
        this.sted = sted;
    }

    public double getPrLiter(){
        return prLiter;
    }

    public void setPrLiter(double prLiter) {
        this.prLiter = prLiter;
    }

    public String getTypeBensin() {
        return typeBensin;
    }

    public void setTypeBensin(String typeBensin) {
        this.typeBensin = typeBensin;
    }

    public double getLiterFylt() {
        return literFylt;
    }

    public void setLiterFylt(double literFylt) {
        this.literFylt = literFylt;
    }

    public String getTidspunktFylt() {
        return tidspunktFylt;
    }

    public void setTidspunktFylt(String tidspunktFylt) {
        this.tidspunktFylt = tidspunktFylt;
    }

    public double finnTotalPrisen(){
        double totalPris = literFylt * prLiter;
        return Double.parseDouble(String.format("%.2f", totalPris));
    }


}



        public class Oppgave3 {
            public static void main(String[] args){
                BensinKjop kjop = new BensinKjop("Oslo","95 oktan", 40.0, 15.5, "12.30");
                double totalPris = kjop.finnTotalPrisen();
                System.out.println("Totalprisen er: " + String.format("%.2f", totalPris));


            }
}
