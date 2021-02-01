package practicum_1;

public class Main {
    public static void main(String[] args){
        System.out.println("\nOpdracht 1");
        for (int optellen = 0; optellen < 11; optellen++) {
            System.out.println(optellen);
        }

        System.out.println("\nOpdracht 2");
        boolean loop = true;
        int getal = 0;
        while(loop){
            if (getal == 10){
                loop = false;
            }
            System.out.println(getal);
            getal++;
        }

        System.out.println("\nOpdracht 3");
        for (int random = 0; random < 11; random++) {
            System.out.println(Math.random());
        }

        System.out.println("\nOpdracht 4");
        int totaal = 0;
        for (int som = 0; som < 40; som++) {
            totaal += som;
        }
        System.out.println(totaal);

        System.out.println("\nOpdracht 5");
        String print = "s";
        for (int lus = 0; lus < 4; lus++) {
            if (print == "ss"){
                System.out.println(print);
                print = "s";
            } else {
                System.out.println(print);
                print = "ss";
            }
        }
    }
}
