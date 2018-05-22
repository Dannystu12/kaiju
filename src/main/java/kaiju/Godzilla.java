package kaiju;

public class Godzilla extends Kaiju{

    public Godzilla(int attackValue, int healthValue){
        super("Godzilla", attackValue, healthValue);
    }

    @Override
    public String roar() {
        return "ROOOOAAAAARRRR!!!";
    }

    @Override
    public String move() {
        return "Godzilla stomps ahead";
    }
}
