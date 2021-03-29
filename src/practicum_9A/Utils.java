package practicum_9A;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

public class Utils {
    private static int count = 0;

    public static void main(String[] args){
        System.out.println(euroBedrag(3.2222));
        System.out.println(euroBedrag(3.64286268, 3));
        System.out.println(count);
    }

    public static String euroBedrag(double bedrag){
        return euroBedrag(bedrag, 2);
    }

    public static String euroBedrag(double bedrag, int precisie){
        count++;
        String test = String.valueOf(bedrag);
        int split = test.indexOf(".");
        String eind = test.substring(split + 1);
        String begin = test.substring(0, split);
        String nieuwEind = eind.substring(0, precisie);
        return "€" + begin + "," + nieuwEind;
    }

    public static int getCount() {
        return count;
    }
}
