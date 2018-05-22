import kaiju.Godzilla;
import kaiju.Kaiju;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class KaijuTest {

    Kaiju kaiju;

    @Before
    public void setup(){
        kaiju = Godzilla.getInstance();
        kaiju.restoreHealth();
    }

    @Test
    public void hasName(){
        assertEquals("Godzilla", kaiju.getName());
    }

    @Test
    public void hasAttackValue(){
        assertEquals(100, kaiju.getAttackValue());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(100, kaiju.getHealthValue());
    }


    @Test
    public void isDeadFalse(){
        assertFalse(kaiju.isDead());
    }

    @Test
    public void isDeadTrue(){
        kaiju.takeDamage(100);
        assertTrue(kaiju.isDead());
    }

    @Test
    public void canTakeDamage(){
        kaiju.takeDamage(10);
        assertEquals(90, kaiju.getHealthValue());
    }

    @Test
    public void canTakeDamageNotMoreThanHealth(){
        kaiju.takeDamage(1000);
        assertEquals(0, kaiju.getHealthValue());
    }
    
}
