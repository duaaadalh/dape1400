package Oppgaver;



class Klokke{

    private int sekund;
    private int minutt;
    private int time;

    public Klokke(int sekund, int minutt, int time){
        this.sekund = sekund;
        this.minutt = minutt;
        this.time = time;
    }

    public void setSekund(int sekund) {
        if (sekund>=0 && sekund<=59){
        this.sekund = sekund;
    }
}
    public int getSekund() {
        return sekund;
    }

    public void setMinutt(int minutt){
    if (minutt >= 0 && minutt <= 59){
        this.minutt = minutt;
    }
        }

    public int getMinutt() {
        return minutt;
    }

    public void setTime(int time){
        if (time >= 0 && time <= 24){
            this.time = time;
        }
    }

    public int getTime() {
        return time;
    }

    // her er vi i samme klasse og trenger ikke å bruke get og set eller konstruktør
    // dermed trenger vi kun å bruke selve attributtene

        public void visTiden(){
           System.out.println(time + " : " + minutt + " : "+ sekund);

    }

}



    public class Oppgave4 {
        public static void main(String[] args){
            Klokke tiden = new Klokke(34, 14, 13);
            tiden.visTiden();

            // Her er vi i en annen klasse og må bruke konstruktøren
            // attributtene er private og i en annen klasse
        }
}
