import behaviour.Attackable;
import gherkin.lexer.He;
import org.junit.Before;
import org.junit.Test;
import vehicle.Helicopter;
import vehicle.Tank;
import vehicle.VehicleType;

import static org.junit.Assert.assertEquals;

public class HelicopterTest {
    Helicopter helicopter;
    Attackable attackable;

    @Before
    public void setup(){
        helicopter = new Helicopter(100);
        attackable = new Tank(100);
    }

    @Test
    public void hasType(){
        assertEquals(VehicleType.AIR ,helicopter.getVehicleType());
    }

    @Test
    public void canAttack(){
        helicopter.attack(attackable);
        assertEquals(90, attackable.getHealthValue());
    }
}
