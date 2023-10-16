package Modul5;


class Klokke {
    private int time;
    private int minutt;
    private int sekund;

    public Klokke(int time, int minutt, int sekund) {
        this.time = time;
        this.minutt = minutt;
        this.sekund = sekund;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        if (time > 0 && time <= 24) {
            this.time = time;
        }
    }

    public int getMinutt(){
        return minutt;
    }

    public void setMinutt(int minutt){
        if (minutt > 0 && minutt <= 60){
            this.minutt = minutt;
        }
    }

    public int getSekund(){
        return sekund;
    }

    public void setSekund(int sekund){
        if (sekund > 0 && sekund <= 60){
            this.sekund = sekund;
        }
    }

    public void visTiden(){
        System.out.println(time + " : " + minutt + " : " + sekund);

    }

}
public class Oppgave4 {

    public static void main (String [] args){
        Klokke enKlokke = new Klokke(13, 35, 14);
        enKlokke.visTiden();

    }
}
