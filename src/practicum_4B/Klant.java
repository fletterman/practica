package practicum_4B;

import java.text.MessageFormat;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String naam) {
        this.naam = naam;
        this.kortingsPercentage = 0;
    }

    public void setKorting(double korting){
        if (korting < 0){
            this.kortingsPercentage = 0;
        }
        else {
            this.kortingsPercentage = korting;
        }
    }

    public double getKortingsPercentage(){
        return kortingsPercentage;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0} (korting: {1}%)", naam, kortingsPercentage);
    }
}
