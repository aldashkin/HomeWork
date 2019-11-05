package fermer;

public abstract class WildAnimal {

    protected int speed; // скорость
    protected int power; // сила
    protected int attackAble; // атака

    public WildAnimal(int speed, int power, int attackAble) {
        this.speed = speed;
        this.power = power;
        this.attackAble = attackAble;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
