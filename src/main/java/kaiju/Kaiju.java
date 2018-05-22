package kaiju;

import behaviour.Attackable;
import behaviour.IAttack;

public abstract class Kaiju implements Attackable, IAttack{

    private String name;
    private int attackValue;
    private int healthValue;
    private final int INITIAL_HEALTH;


    public Kaiju(String name, int attackValue, int healthValue){
        this.name = name;
        this.attackValue = attackValue;
        this.healthValue = healthValue;
        INITIAL_HEALTH = healthValue;
    }

    public String getName() {
        return name;
    }

    public int getAttackValue() {
        return attackValue;
    }

    @Override
    public int getHealthValue() {
        return healthValue;
    }

    public abstract String roar();

    public abstract String move();

    @Override
    public void takeDamage(int damage) {
        if(damage <= healthValue) {
            healthValue -= damage;
        } else {
            healthValue = 0;
        }
    }

    @Override
    public void attack(Attackable attackable) {
        attackable.takeDamage(getAttackValue());
    }

    @Override
    public boolean isDead(){
        return healthValue <= 0;
    }

    public void restoreHealth(){
        this.healthValue = INITIAL_HEALTH;
    }
}
