package practicum_8;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList alleGoederen;

    public BedrijfsInventaris(String bedrijfsnaam, double budget) {
        this.bedrijfsnaam = bedrijfsnaam;
        this.budget = budget;
        alleGoederen = new ArrayList<>();
    }

    public void schafAan(Goed g){
        for (Object goed : alleGoederen){
            if (goed.equals(g)){
                return;
            }
        }
        if (g.huidigeWaarde() > budget){
            return;
        }
        alleGoederen.add(g);
        budget -= g.huidigeWaarde();
        return;
    }

    @Override
    public String toString() {
        String string = "BedrijfsInventaris{" + "bedrijfsnaam='" + bedrijfsnaam + '\'' + ", budget=" + budget + ", alleGoederen=\n";
        for (Object goed : alleGoederen){
            string += goed.toString() + "\n";
        }
        return string;
    }
}
