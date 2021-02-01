package practicum_3B;

import java.text.MessageFormat;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int radius, int xPositie, int yPositie) throws IllegalAccessException {
        if (radius < 1){
            throw new IllegalAccessException("Radius moet groter dan 0 zijn!");
        }
        this.radius = radius;
        this.xPositie = xPositie;
        this.yPositie = yPositie;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Cirkel ({0}, {1}) met radius: {2}", xPositie, yPositie, radius);
    }
}