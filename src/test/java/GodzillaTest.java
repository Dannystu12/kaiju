import kaiju.Godzilla;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GodzillaTest {

    Godzilla godzilla;

    @Before
    public void setup(){
        godzilla = new Godzilla(100, 100);
    }

    @Test
    public void hasName(){
        assertEquals("Godzilla", godzilla.getName());
    }

    @Test
    public void canRoar(){
        assertEquals("ROOOOAAAAARRRR!!!", godzilla.roar());
    }

    @Test
    public void canMove(){
        assertEquals( "Godzilla stomps ahead", godzilla.move());
    }


}
