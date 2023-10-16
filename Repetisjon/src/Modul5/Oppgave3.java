package Modul5;


    class bensinKjøp{
        private String bensinstasjon;
        private String typeBensin;
        private double literFylt;
        private double prisPerLite;
        private String tidspunktFylt;

        public bensinKjøp(String bensinstasjon, String typeBensin, double literFylt,
                          double prisPerLite, String tidspunktFylt){
            this.bensinstasjon = bensinstasjon;
            this.typeBensin = typeBensin;
            this.literFylt = literFylt;
            this.prisPerLite = prisPerLite;
            this.tidspunktFylt = tidspunktFylt;
        }

        public String getBensinstasjon(){
            return bensinstasjon;
        }

        public void setBensinstasjon(String bensinstasjon){
            this.bensinstasjon = bensinstasjon;
        }

        public String getTypeBensin(){
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

        public double getPrisPerLite() {
            return prisPerLite;
        }

        public void setPrisPerLite(double prisPerLite) {
            this.prisPerLite = prisPerLite;
        }

        public String getTidspunktFylt() {
            return tidspunktFylt;
        }

        public void setTidspunktFylt(String tidspunktFylt) {
            this.tidspunktFylt = tidspunktFylt;
        }

        public double finnTotalprisen(){
            return literFylt * prisPerLite;
        }


    }

public class Oppgave3 {
    public static void main (String [] args){
        bensinKjøp ettBensinkjøp = new bensinKjøp("Asker", "95", 23.5, 19, "13:05");
        double pris = ettBensinkjøp.finnTotalprisen();
        String prisToDesimaler = String.format("%.2f", pris);
        String ut = "Det kostet totalt " + prisToDesimaler + " kroner i " + ettBensinkjøp.getBensinstasjon()+
                " klokken " + ettBensinkjøp.getTidspunktFylt();
        System.out.println(ut);

    }
}
