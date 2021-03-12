package practicum_8;

import java.util.Objects;

abstract class Voertuig implements Goed{
    private String type;
    protected double nieuwPrijs;
    protected int bouwjaar;

    public Voertuig(String type, double nieuwPrijs, int bouwjaar) {
        this.type = type;
        this.nieuwPrijs = nieuwPrijs;
        this.bouwjaar = bouwjaar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voertuig voertuig = (Voertuig) o;
        return Double.compare(voertuig.nieuwPrijs, nieuwPrijs) == 0 &&
                bouwjaar == voertuig.bouwjaar &&
                Objects.equals(type, voertuig.type);
    }

    @Override
    public String toString() {
        return "Voertuig: " + type + " met een bouwjaar " + bouwjaar + " heeft een waarde van: €";
    }
}
