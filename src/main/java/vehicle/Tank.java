package vehicle;

import behaviour.Attackable;
import behaviour.IAttack;

public class Tank extends Vehicle implements IAttack{
    private int attackValue;

    public Tank(int healthValue){
        super(healthValue, VehicleType.LAND);
        this.attackValue = 20;
    }

    @Override
    public void attack(Attackable attackable) {
        attackable.takeDamage(attackValue);
    }
}
