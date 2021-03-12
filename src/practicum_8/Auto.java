package practicum_8;

import java.util.Calendar;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String type, double nieuwPrijs, int bouwjaar, String kenteken) {
        super(type, nieuwPrijs, bouwjaar);
        this.kenteken = kenteken;
    }

    @Override
    public double huidigeWaarde() {
        return Math.round((nieuwPrijs * Math.pow(0.7, Calendar.getInstance().get(Calendar.YEAR) - bouwjaar)) * 100) / 100;
    }

    @Override
    public String toString() {
        return super.toString() + huidigeWaarde();
    }
}
