package practicum_3A;

import java.text.MessageFormat;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen = 0;
    private int aantalVerloren = 0;
    private int aantalGelijk = 0;

    public Voetbalclub(String naam) {
        if (naam == null || naam == ""){
            this.naam = "FC";
        } else {
            this.naam = naam;
        }
    }

    public String getNaam() {
        return naam;
    }

    public int getAantalGewonnen() {
        return aantalGewonnen;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w') {
            aantalGewonnen += 1;
        }else if (ch == 'g') {
            aantalGelijk += 1;
        }else if (ch == 'v') {
            aantalVerloren += 1;
        }
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
