package practicum_4B;

import java.text.MessageFormat;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur() {}

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public void setHuurder(Klant huurder) {
        if (huurder == null){
            throw new IllegalArgumentException("er is geen huurder bekend");
        }
        this.huurder = huurder;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setGehuurdeAuto(Auto gehuurdeAuto) {
        if (gehuurdeAuto == null){
            throw new IllegalArgumentException("er is geen auto bekend");
        }
        this.gehuurdeAuto = gehuurdeAuto;
    }

    public double totaalPrijs(){
        try {
            return aantalDagen * gehuurdeAuto.getPrijsPerDag() * (1-(huurder.getKortingsPercentage()/100));
        }catch (NullPointerException nullPointerException){
            return 0.0;
        }
    }

    @Override
    public String toString() {
        if (getGehuurdeAuto() == null && getHuurder() == null){
            return MessageFormat.format("er is geen auto bekend\ner is geen huurder bekend\naantal dagen: {0} en dat kost {1}", aantalDagen, totaalPrijs());
        }
        if (getGehuurdeAuto() == null){
            return MessageFormat.format("er is geen auto bekend\nop naam van: {0}\naantal dagen: {1} en dat kost {2}", getHuurder(), aantalDagen, totaalPrijs());
        }
        if (getHuurder() == null){
            return MessageFormat.format("autotype: {0}\ner is geen huurder bekend\naantal dagen: {1} en dat kost {2}", getGehuurdeAuto(), aantalDagen, totaalPrijs());
        }
        return MessageFormat.format("autotype: {0}\nop naam van: {1}\naantal dagen: {2} en dat kost {3}", getGehuurdeAuto(), getHuurder(), aantalDagen, totaalPrijs());
    }
}
