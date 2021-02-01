package practicum_4A;

import java.text.MessageFormat;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adres, int bouwjaar) {
        this.adres = adres;
        this.bouwjaar = bouwjaar;
    }

    public void setHuisbaas(Persoon huisbaas) {
        this.huisbaas = huisbaas;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Huis {0} is gebouwd in {1} \nen heeft huisbaas {2}", adres, bouwjaar, huisbaas.toString());
    }
}
