package fermer;

abstract public class WildAnimal extends Animal implements Attack{

    protected int attackScore;

    public WildAnimal(String name, int speed, int health, int attackScore) {
        super(name, speed, health, attackScore);
        this.attackScore = attackScore; // дикое животное может наносить урон домашнему
    }
}
