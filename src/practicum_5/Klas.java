package practicum_5;

import java.util.ArrayList;
import java.util.List;

public class Klas {
    private String klasCode;
    private List<Leerling> leerlingen;

    public Klas(String klasCode) {
        this.klasCode = klasCode;
        this.leerlingen = new ArrayList<>();
    }

    public void voegLeerlingToe(Leerling leerling){
        this.leerlingen.add(leerling);
    }

    public void wijzigCijfer(String naam, double nieuwCijfer){
        for (Leerling leerling : leerlingen){
            if (leerling.getNaam().equals(naam)){
                leerling.setCijfer(nieuwCijfer);
            }
        }
    }

    public List<Leerling> getLeerlingen() {
        return leerlingen;
    }

    public int aantalLeerlingen(){
        return leerlingen.size();
    }

    @Override
    public String toString() {
        String tekst = "In klas " + klasCode + " zitten de volgende leerlingen:";
        for (Leerling leerling : leerlingen){
            tekst += leerling.toString();
        }
        return tekst;
    }
}
