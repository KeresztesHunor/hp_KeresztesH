package hengerprogram;

public class Henger
{
    private static int hengerDb;
    private final double sugar;
    private final double magassag;

    public Henger(double sugar, double magassag)
    {
        this.sugar = sugar;
        this.magassag = magassag;
        hengerDb++;
    }

    public static int getHengerDb()
    {
        return hengerDb;
    }

    public double getSugar()
    {
        return sugar;
    }

    public double getMagassag()
    {
        return magassag;
    }

    public double terfogat()
    {
        return sugar * sugar * Math.PI * magassag;
    }
    
    @Override public String toString()
    {
        return "Henger{" + "sugar=" + sugar + ", magassag=" + magassag + '}';
    }
}
