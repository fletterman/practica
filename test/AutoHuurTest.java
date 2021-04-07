import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import practicum_4B.*;

public class AutoHuurTest {
    private AutoHuur autoHuur;
    private Klant klant;
    private Klant klantNull = null;
    private Auto auto;
    private Auto autoNull = null;

    @BeforeEach
    public void init(){
        autoHuur = new AutoHuur();
    }

    @Test
    void setHuurder(){
        klant = new Klant("test");
        autoHuur.setHuurder(klant);
        assertEquals("test (korting: 0%)", autoHuur.getHuurder().toString());
    }

    @Test
    void setHuurderMetKorting(){
        autoHuur.setHuurder(new Klant("test"));
        autoHuur.getHuurder().setKorting(5);
        assertEquals("test (korting: 5%)", autoHuur.getHuurder().toString());
    }

    @Test
    void leegHuur(){
        assertEquals(autoHuur.toString(), "er is geen auto bekend\ner is geen huurder bekend\naantal dagen: 0 en dat kost 0");
    }

    @Test
    void alleenKlant(){
        klant = new Klant("test");
        autoHuur.setHuurder(klant);
        assertEquals(autoHuur.toString(), "er is geen auto bekend\nop naam van: test (korting: 0%)\naantal dagen: 0 en dat kost 0");
    }

    @Test
    void alleenAuto(){
        auto = new Auto("audi", 50.00);
        autoHuur.setGehuurdeAuto(auto);
        assertEquals(autoHuur.toString(), "autotype: audi met prijs per dag: 50\ner is geen huurder bekend\naantal dagen: 0 en dat kost 0");
    }

    @Test
    void autoEnKlant(){
        auto = new Auto("audi", 50.00);
        klant = new Klant("test");
        autoHuur.setGehuurdeAuto(auto);
        autoHuur.setHuurder(klant);
        assertEquals(autoHuur.toString(), "autotype: audi met prijs per dag: 50\nop naam van: test (korting: 0%)\naantal dagen: 0 en dat kost 0");
    }

    @Test
    void autoEnKlantEnKorting(){
        auto = new Auto("audi", 50.00);
        klant = new Klant("test");
        klant.setKorting(5);
        autoHuur.setGehuurdeAuto(auto);
        autoHuur.setHuurder(klant);
        assertEquals(autoHuur.toString(), "autotype: audi met prijs per dag: 50\nop naam van: test (korting: 5%)\naantal dagen: 0 en dat kost 0");
    }

    @Test
    void negatieveKorting(){
        klant = new Klant("test");
        klant.setKorting(-4);
        autoHuur.setHuurder(klant);
        assertEquals(autoHuur.toString(), "er is geen auto bekend\nop naam van: test (korting: 0%)\naantal dagen: 0 en dat kost 0");
    }

    @Test
    void negatieveDagen(){
        auto = new Auto("audi", 409);
        autoHuur.setGehuurdeAuto(auto);
        autoHuur.setAantalDagen(-4);
        assertEquals(autoHuur.toString(), "autotype: audi met prijs per dag: 409\ner is geen huurder bekend\naantal dagen: 0 en dat kost 0");
    }

    @Test
    void negatievePrijsPerDag(){
        auto = new Auto("audi", -3425);
        autoHuur.setGehuurdeAuto(auto);
        assertEquals(autoHuur.toString(), "autotype: audi met prijs per dag: 0\ner is geen huurder bekend\naantal dagen: 0 en dat kost 0");
    }

    //Alle tests zullen vanaf hier falen/exception gooien omdat ik deze situaties al in de code opvang. Een autohuur mag namelijk niet bestaan zonder een auto of/en zonder een klant.
    @Test
    void setAutoNull(){
        autoHuur.setGehuurdeAuto(autoNull);
        assertEquals(autoHuur.toString(), "er is geen auto bekend\ner is geen huurder bekend\naantal dagen: 0 en dat kost 0.0");
    }

    @Test
    void setKlantNull(){
        autoHuur.setHuurder(klantNull);
        assertEquals(autoHuur.toString(), "er is geen auto bekend\ner is geen huurder bekend\naantal dagen: 0 en dat kost 0.0");
    }

    @Test
    void beideNull(){
        autoHuur.setHuurder(klantNull);
        autoHuur.setGehuurdeAuto(autoNull);
        assertEquals(autoHuur.toString(), "er is geen auto bekend\ner is geen huurder bekend\naantal dagen: 0 en dat kost 0.0");
    }
}
