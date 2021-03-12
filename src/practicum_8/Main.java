package practicum_8;

public class Main {
    public static void main(String[] args) {
        BedrijfsInventaris bedrijf = new BedrijfsInventaris("test", 5000.00);
        Auto auto = new Auto("Mercedes-Benz A-klasse A 180", 29995.00, 2019, "4-ZTV-94");
        Auto auto1 = new Auto("Mercedes-Benz A-klasse A 180", 29995.00, 2019, "4-ZTV-94");
        Auto auto2 = new Auto("Mercedes-Benz A-klasse A 140", 29995.00, 2014, "4-ZTV-94");
        Fiets fiets = new Fiets("Scott", 3000.00, 2016, 259826984);
        Fiets fiets1 = new Fiets("Scott", 3000.00, 2016, 259826984);
        Fiets fiets2 = new Fiets("Cube", 3000.00, 2016, 259826984);
        Computer computer = new Computer("Macbook pro", "TE-ST-IN-GA-DR-ES", 1000.00, 2019);
        Computer computer1 = new Computer("Macbook pro", "TE-ST-IN-GA-DR-ES", 1000.00, 2019);
        Computer computer2 = new Computer("Lenovo Yoga laptop", "TE-ST-IN-GA-DR-ES", 1000.00, 2019);
        bedrijf.schafAan(auto);
        bedrijf.schafAan(auto1);
        bedrijf.schafAan(auto2);
        bedrijf.schafAan(fiets);
        bedrijf.schafAan(fiets1);
        bedrijf.schafAan(fiets2);
        bedrijf.schafAan(computer);
        bedrijf.schafAan(computer1);
        bedrijf.schafAan(computer2);
        System.out.println(bedrijf.toString());
    }
}
