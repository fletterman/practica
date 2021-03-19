package practicum_8;

import java.util.Calendar;
import java.util.Objects;

public class Computer implements Goed{
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String type, String macAdres, double aanschafPrijs, int productieJaar) {
        this.type = type;
        this.macAdres = macAdres;
        this.aanschafPrijs = aanschafPrijs;
        this.productieJaar = productieJaar;
    }

    @Override
    public String huidigeWaarde() {
        return Utils.euroBedrag(aanschafPrijs * Math.pow(0.6, Calendar.getInstance().get(Calendar.YEAR) - productieJaar));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Double.compare(computer.aanschafPrijs, aanschafPrijs) == 0 &&
                productieJaar == computer.productieJaar &&
                Objects.equals(type, computer.type) &&
                Objects.equals(macAdres, computer.macAdres);
    }

    @Override
    public String toString() {
        return "Computer: " + type + " heeft een waarde van: €" + huidigeWaarde();
    }
}
