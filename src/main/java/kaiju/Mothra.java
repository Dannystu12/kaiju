package kaiju;

public class Mothra extends Kaiju {

    private static final Mothra instance = new Mothra(100, 100);

    private Mothra(int attackValue, int healthValue){
        super("Mothra", attackValue, healthValue);
    }

    public static Mothra getInstance(){
        return instance;
    }

    @Override
    public String roar() {
        return "MOTH NOISES!";
    }

    @Override
    public String move() {
        return "Mothra flies ahead";
    }
}
