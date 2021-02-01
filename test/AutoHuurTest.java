import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import practicum_4B.*;

public class AutoHuurTest {
    private AutoHuur autoHuur;
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
}
