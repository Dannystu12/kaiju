import org.junit.Before;
import org.junit.Test;
import vehicle.Helicopter;
import vehicle.Vehicle;
import vehicle.VehicleType;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class VehicleTest {
    Vehicle vehicle;

    @Before
    public void setup(){
        this.vehicle = new Helicopter(100);
    }

    @Test
    public void hasHealthValue(){
        assertEquals(100, vehicle.getHealthValue());
    }

    @Test
    public void hasVehicleType(){
        assertEquals(VehicleType.AIR, vehicle.getVehicleType());
    }

    @Test
    public void isDeadFalse(){
        assertFalse(vehicle.isDead());
    }

    @Test
    public void isDeadTrue(){
        vehicle.takeDamage(100);
        assertTrue(vehicle.isDead());
    }

    @Test
    public void canTakeDamage(){
        vehicle.takeDamage(10);
        assertEquals(90, vehicle.getHealthValue());
    }

    @Test
    public void canTakeDamageNotMoreThanHealth(){
        vehicle.takeDamage(1000);
        assertEquals(0, vehicle.getHealthValue());
    }
}
