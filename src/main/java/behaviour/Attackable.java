package behaviour;

public interface Attackable {
    public void takeDamage(int damage);
    public int getHealthValue();
    public boolean isDead();
}
