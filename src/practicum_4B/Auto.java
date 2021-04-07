package practicum_4B;

import java.text.MessageFormat;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String type, double prijsPerDag) {
        this.type = type;
        if (prijsPerDag < 0){
            this.prijsPerDag = 0;
        }
        else {
            this.prijsPerDag = prijsPerDag;
        }
    }

    public void setPrijsPerDag(double prijsPerDag) {
        if (prijsPerDag < 0){
            this.prijsPerDag = 0;
        }
        else {
            this.prijsPerDag = prijsPerDag;
        }
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0} met prijs per dag: {1}", type, prijsPerDag);
    }
}
