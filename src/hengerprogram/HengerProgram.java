package hengerprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HengerProgram
{
    private final ArrayList<Henger> hengerek;

    public HengerProgram()
    {
        hengerek = new ArrayList<>();
        hengerek.add(new Henger(1, 1));
        hengerek.add(new TomorHenger(1, 1));
        hengerek.add(new Cso(1, 1, 0.5));
        hengerek.add(new Cso(1, 1, 0.1));
    }
    
    private double atlagTerfogat()
    {
        double osszTerfogat = 0;
        for (Henger henger : hengerek)
        {
            osszTerfogat += henger.terfogat();
        }
        return osszTerfogat / hengerek.size();
    }
    
    private double csovekSulya()
    {
        double osszSuly = 0;
        for (Henger henger : hengerek)
        {
            if (henger instanceof Cso cso)
            {
                osszSuly += cso.suly();
            }
        }
        return osszSuly;
    }
    
    private List<Henger> lista()
    {
        return Collections.unmodifiableList(hengerek);
    }
    
    private void run()
    {
        System.out.printf("Összesen %d db henger van a programban\n", Henger.getHengerDb());
        System.out.println("A hengerek átlagtérfogata: " + atlagTerfogat());
        System.out.println("A csövek összsúlya: " + csovekSulya());
        for (Henger henger : lista())
        {
            System.out.println(henger);
        }
        lista();
    }
    
    public static void main(String[] args)
    {
        new HengerProgram().run();
    }
}
