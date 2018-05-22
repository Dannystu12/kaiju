package environment;

import behaviour.Attackable;

public class Building implements Attackable{
    private int healthValue;

    public Building(int healthValue){
        this.healthValue = healthValue;
    }


    @Override
    public void takeDamage(int damage) {
        if(damage <= healthValue) {
            healthValue -= damage;
        } else {
            healthValue = 0;
        }
    }

    @Override
    public int getHealthValue() {
        return healthValue;
    }

    @Override
    public boolean isDead() {
        return healthValue <= 0;
    }
}
