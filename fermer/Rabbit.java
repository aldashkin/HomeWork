package fermer;

public class Rabbit extends HomeAnimal {

    private int startHealth = this.health;

    public Rabbit(String name, int weight, int speed, int health, int resource, boolean eatMe) {
        super(name, weight, speed, health, resource, eatMe);
    }

    @Override
    public void eat() {
        this.weight += 7;
        if (this.weight < startHealth){
            this.health += 7;

        }
    }
}
