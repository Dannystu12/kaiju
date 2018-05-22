import kaiju.Mothra;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MothraTest {

    Mothra mothra;

    @Before
    public void setup(){
        mothra = Mothra.getInstance();
        mothra.restoreHealth();
    }

    @Test
    public void hasName(){
        assertEquals("Mothra", mothra.getName());
    }

    @Test
    public void canRoar(){
        assertEquals("MOTH NOISES!", mothra.roar());
    }

    @Test
    public void canMove(){
        assertEquals( "Mothra flies ahead", mothra.move());
    }

}
