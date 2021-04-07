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
        autoHuur.setHuurder(new Klant("test"));
        assertEquals("test (korting: 0%)", autoHuur.getHuurder().toString());
    }

    @Test
    void setHuurderMetKorting(){
        autoHuur.setHuurder(new Klant("test"));
        autoHuur.getHuurder().setKorting(5);
        assertEquals("test (korting: 5%)", autoHuur.getHuurder().toString());
    }

    //Alle tests zullen vanaf hier falen/exception gooien omdat ik deze situaties al in de code opvang. Een autohuur mag namelijk niet bestaan zonder een auto of/en zonder een klant.
    @Test
    void setAuto(){
        autoHuur.setHuurder(klantNull);
        assertEquals("er is geen auto bekend\ner is geen huurder bekend\naantal dagen: 0 en dat kost 0.0", "test");
    }

    @Test
    void setKlantNull
}
