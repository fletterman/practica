package practicum_5;

import java.text.MessageFormat;

public class Leerling {
    private String naam;
    private double cijfer;

    public Leerling(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public double getCijfer() {
        return cijfer;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }


    @Override
    public String toString() {
        return MessageFormat.format("\n{0} heeft cijfer: {1}", naam, cijfer);
    }
}
