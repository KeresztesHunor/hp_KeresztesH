package hengerprogram;

public class Cso extends TomorHenger
{
    private final double falvastagsag;

    public Cso(double sugar, double magassag, double falvastagsag)
    {
        super(sugar, magassag, 1);
        this.falvastagsag = falvastagsag;
    }

    public Cso(double sugar, double magassag, double falvastagsag, double fajsuly)
    {
        super(sugar, magassag, fajsuly);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag()
    {
        return falvastagsag;
    }

    @Override public String toString()
    {
        return "Cso{" + "sugar=" + getSugar() + ", magassag=" + getMagassag() + "fajsuly=" + getFajsuly() + "falvastagsag=" + falvastagsag + '}';
    }

    @Override public double terfogat()
    {
        return super.terfogat() - new Henger(super.getSugar() - falvastagsag, super.getMagassag()).terfogat();
    }
}
