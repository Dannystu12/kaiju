package kaiju;

public class Mothra extends Kaiju {
    public Mothra(int attackValue, int healthValue){
        super("Mothra", attackValue, healthValue);
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
