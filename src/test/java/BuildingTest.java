import environment.Building;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BuildingTest {

    Building building;

    @Before
    public void setup(){
        building = new Building(100);
    }

    @Test
    public void hasHealthValue(){
        assertEquals(100, building.getHealthValue());
    }

    @Test
    public void isDeadFalse(){
        assertFalse(building.isDead());
    }

    @Test
    public void isDeadTrue(){
        building.takeDamage(100);
        assertTrue(building.isDead());
    }

    @Test
    public void canTakeDamage(){
        building.takeDamage(10);
        assertEquals(90, building.getHealthValue());
    }

    @Test
    public void canTakeDamageNotMoreThanHealth(){
        building.takeDamage(1000);
        assertEquals(0, building.getHealthValue());
    }



}
