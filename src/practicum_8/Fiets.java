package practicum_8;

import java.util.Calendar;

public class Fiets extends Voertuig {
    private int framenummer;


    public Fiets(String type, double nieuwPrijs, int bouwjaar, int framenummer) {
        super(type, nieuwPrijs, bouwjaar);
        this.framenummer = framenummer;
    }

    @Override
    public String huidigeWaarde() {
        return Utils.euroBedrag(nieuwPrijs * Math.pow(0.9, Calendar.getInstance().get(Calendar.YEAR) - bouwjaar));
    }

    @Override
    public String toString() {
        return super.toString() + huidigeWaarde();
    }
}
