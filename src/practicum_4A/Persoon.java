package practicum_4A;

import java.text.MessageFormat;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}; leeftijd {1} jaar", naam, leeftijd);
    }
}
