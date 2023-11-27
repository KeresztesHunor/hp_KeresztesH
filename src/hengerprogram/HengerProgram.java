package hengerprogram;

import java.util.ArrayList;

public class HengerProgram {

    private ArrayList<Henger> hengerek;

    public HengerProgram() {
        hengerek.add(new Henger(3,5.1));
        hengerek.add(new TomorHenger(3,5.1));
        hengerek.add(new TomorHenger(3,5.1,3));
        hengerek.add(new Cso(1,5.2,3));
        hengerek.add(new Cso(1,5.2,5, 2));
    }
    
    public double atlagTerfogat(){
        return 0;
    }
    
    public double csovekSulya(){
        return 0;
    }
    
    private ArrayList lista(){
        return null;
    }
    
    public void run(){
        
    }
    
    public static void main(String[] args) {
        
    }
}
