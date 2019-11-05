package fermer;

public class Chicken extends HomeAnimal {

    private int startHealth = this.health;

    public Chicken(String name, int weight, int speed, int health, int resource, boolean eatMe) {
        super(name, weight, speed, health, resource, eatMe);
    }

    @Override
    public void eat() {
        this.weight += 4;
        if (this.weight < startHealth){
            this.health += 4;
        }
    }
}
