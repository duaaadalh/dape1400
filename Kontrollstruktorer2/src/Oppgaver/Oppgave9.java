package Oppgaver;

// Pi=4-4/3+4/5-4/7+4/9-4/11+....

public class Oppgave9 {
    public static void main(String[] args){
       double pi = 0;
       double s = 1;
       int n = 10000;
       for (int i = 1; i < n; i = i+2){
           pi += s/i;
           s = -s;

       }
       System.out.println("Pi = " + pi * 4);



    }
}

