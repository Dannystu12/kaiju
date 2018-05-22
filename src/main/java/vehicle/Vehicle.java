package vehicle;

import behaviour.Attackable;
import behaviour.IAttack;

public abstract class Vehicle implements Attackable{

    private int healthValue;
    private VehicleType vehicleType;

    public Vehicle(int healthValue, VehicleType vehicleType){
        this.healthValue = healthValue;
        this.vehicleType = vehicleType;
    }

    @Override
    public int getHealthValue() {
        return healthValue;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    @Override
    public void takeDamage(int damage){
        if(damage <= healthValue) {
            healthValue -= damage;
        } else {
            healthValue = 0;
        }
    }

    @Override
    public boolean isDead(){
        return healthValue <= 0;
    }
}
