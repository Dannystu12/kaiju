import behaviour.Attackable;
import org.junit.Before;
import org.junit.Test;
import vehicle.Helicopter;
import vehicle.Tank;
import vehicle.VehicleType;

import static org.junit.Assert.assertEquals;

public class TankTest {
    Tank tank;
    Attackable attackable;

    @Before
    public void setup(){
        tank = new Tank(100);
        attackable = new Helicopter(100);
    }

    @Test
    public void hasType(){
        assertEquals(VehicleType.LAND ,tank.getVehicleType());
    }

    @Test
    public void canAttack(){
        tank.attack(attackable);
        assertEquals(80, attackable.getHealthValue());
    }
}
