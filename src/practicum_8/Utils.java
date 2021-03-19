package practicum_8;

import java.text.DecimalFormat;

public class Utils {
    public static void main(String[] args){
        System.out.println(euroBedrag(3.2222));
        System.out.println(euroBedrag(3.64286268, 3));
    }

    public static String euroBedrag(double bedrag){
        return new DecimalFormat("##.##").format(bedrag);
    }

    public static String euroBedrag(double bedrag, int precisie){
        String test = String.valueOf(bedrag);
        int split = test.indexOf(".");
        String eind = test.substring(split + 1);
        String begin = test.substring(0, split);
        String nieuwEind = eind.substring(0, precisie);
        return begin + "." + nieuwEind;
    }
}
