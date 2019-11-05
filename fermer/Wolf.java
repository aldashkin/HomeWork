package fermer;

public class Wolf extends fermer.WildAnimal {

    public Wolf(int speed, int power, int attackAble) {
        super(speed, power, attackAble);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAttackAble() {
        return attackAble;
    }

    public void setAttackAble(int attackAble) {
        this.attackAble = attackAble;
    }
}
