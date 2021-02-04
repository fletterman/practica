package practicum_6B;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.Objects;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String naam, int releaseJaar, double nieuwprijs) {
        this.naam = naam;
        this.releaseJaar = releaseJaar;
        this.nieuwprijs = nieuwprijs;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde(){
        double huidigJaar = LocalDate.now().getYear();
        double jarenUit = huidigJaar - releaseJaar;
        if (jarenUit == 0){
            return nieuwprijs;
        }
        return nieuwprijs * Math.pow(0.7, jarenUit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return releaseJaar == game.releaseJaar &&
                naam.equals(game.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam, releaseJaar, nieuwprijs);
    }

    @Override
    public String toString() {
        return MessageFormat.format("\n{0}, uitgegeven in {1}; nieuwprijs: €{2} nu voor: €{3}", naam, String.format("%04d", releaseJaar), String.format("%.2f", nieuwprijs), String.format("%.2f",huidigeWaarde()));
    }
}
