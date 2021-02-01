import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import practicum_3A.Voetbalclub;

public class VoetbalclubTest {
    @Test
    void naamAanmaken(){
        Voetbalclub voetbalclub = new Voetbalclub("");
        assertEquals("FC", voetbalclub.getNaam());

        Voetbalclub voetbalclub1 = new Voetbalclub("test");
        assertEquals("test", voetbalclub1.getNaam());
    }

    @Test
    void resultaatVerwerken(){
        Voetbalclub voetbalclub = new Voetbalclub("test");
        voetbalclub.verwerkResultaat('t');
        assertEquals(0, voetbalclub.aantalGespeeld());

        voetbalclub.verwerkResultaat('w');
        assertEquals(1, voetbalclub.aantalGespeeld());
    }
}
