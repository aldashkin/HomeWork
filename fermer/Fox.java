package fermer;

public class Fox extends fermer.WildAnimal {

    public Fox(int speed, int power, int attackAble) {
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
