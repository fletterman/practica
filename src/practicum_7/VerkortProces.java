package practicum_7;

import java.util.ArrayList;

public class VerkortProces implements OpmaakProces {
    private int eind;

    public VerkortProces(int eind) {
        this.eind = eind;
    }

    @Override
    public String maakOp(String input) {
        input = input.substring(0, eind) + "...";
        return input;
    }
}
