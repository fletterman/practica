package practicum_2B;

import java.text.MessageFormat;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen = 0;
    private int aantalVerloren = 0;
    private int aantalGelijk = 0;

    public Voetbalclub(String naam) {
        this.naam = naam;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen += 1;
        if (ch == 'g')
            aantalGelijk += 1;
        if (ch == 'v')
            aantalVerloren += 1;
    }

    public int aantalPunten(){
        return aantalGewonnen * 3 + aantalGelijk;
    }

    public int aantalGespeeld(){
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0} {1} {2} {3} {4} {5}", naam, aantalGespeeld(), aantalGewonnen, aantalGelijk, aantalVerloren, aantalPunten());
    }
}
