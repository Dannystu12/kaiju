package vehicle;

import behaviour.Attackable;
import behaviour.IAttack;

public class Helicopter extends Vehicle implements IAttack{

    private int attackValue;

    public Helicopter(int healthValue){
        super(healthValue, VehicleType.AIR);
        this.attackValue = 10;
    }

    @Override
    public void attack(Attackable attackable) {
        attackable.takeDamage(attackValue);
    }
}
