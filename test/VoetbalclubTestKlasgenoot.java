import org.junit.jupiter.api.Test;
import practicum_3A.Voetbalclub;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoetbalclubTestKlasgenoot {
    @Test
    void naamAanmaken(){
        Voetbalclub voetbalclub = new Voetbalclub("");
        assertEquals("FC", voetbalclub.getNaam());

        Voetbalclub voetbalclub1 = new Voetbalclub("test");
        assertEquals("test", voetbalclub1.getNaam());
    }

    @Test
    void resultaatVerwerken() {
        Voetbalclub voetbalclub = new Voetbalclub("test");
        voetbalclub.verwerkResultaat('t');
        assertEquals(0, voetbalclub.aantalGespeeld());
    }
    @Test
    void aantalGespeeld(){
        Voetbalclub voetbalclub = new Voetbalclub("test");
        voetbalclub.verwerkResultaat('w');
        assertEquals(1, voetbalclub.aantalGespeeld());
    }

    @Test
    void foutResultaat(){
        Voetbalclub voetbalclub = new Voetbalclub("test");
        voetbalclub.verwerkResultaat('f');
        assertEquals(0, voetbalclub.aantalPunten());
    }

    @Test
    void foutResultaatAantalGespeeld(){
        Voetbalclub voetbalclub = new Voetbalclub("test");
        voetbalclub.verwerkResultaat('f');
        assertEquals(0, voetbalclub.aantalGespeeld());
    }
}
