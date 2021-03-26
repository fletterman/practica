package practicum_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.readAllLines;

public class prijsOmzet {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef de locatie van het bestand waar de gegevens in staan:");
        String infoNaam = scanner.nextLine();
        System.out.println("Geef de locatie van het betand waar de nieuwe gegevens in moeten komen:");
        String eindNaam = scanner.nextLine();
        System.out.println("Geef de huidige koers van 1 USD naar Eurocenten:");
        String conversie = scanner.nextLine();
        System.out.println(schrijf(infoNaam, eindNaam, conversie));
    }

    public static String schrijf(String infoNaam, String eindNaam, String conversie) {
        Path infoPad = null;
        Path eindPad = null;
        infoPad = Path.of(infoNaam);
        eindPad = Path.of(eindNaam);
        try{
            Float.parseFloat(conversie);
        } catch (Exception e){
            return "Geef een normaal getal als conversie-getal.";
        }
        List<String> allLines = null;
        try {
            allLines = readAllLines(infoPad);
        } catch (IOException e) {
            return "Geef een geldige bestandslocati";
        }
        List<String> newLines = new ArrayList<>();
        for (String line : allLines){
            List<String> split = Arrays.asList(line.split(" : "));
            split.set(1, String.valueOf(Float.parseFloat(split.get(1)) * Float.parseFloat(conversie) / 100));
            newLines.add(split.get(0) + " : " + split.get(1));
        }
        BufferedWriter out = null;
        try {
            out = Files.newBufferedWriter(eindPad);
        } catch (IOException e) {
            return "Was niet in staat de schrijver te maken";
        }
        for (String line : newLines){
            try {
                out.write(line + "\n");
            } catch (IOException e) {
                return "Was niet in staat de regel te schrijven";
            }
        }
        try {
            out.close();
        } catch (IOException e) {
            return "Was niet in staat de schrijver te sluiten";
        }
        return "Geslaagde omzetting";
    }
}
