package kaiju;

public class Godzilla extends Kaiju{

    private static final Godzilla instance = new Godzilla(100, 100);

    private Godzilla(int attackValue, int healthValue){
        super("Godzilla", attackValue, healthValue);
    }

    public static Godzilla getInstance(){
        return instance;
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
