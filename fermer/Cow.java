package fermer;

public class Cow extends HomeAnimal {

    private int startHealth = this.health;

    public Cow(String name, int weight, int speed, int health, int resource, boolean eatMe) {
        super(name, weight, speed, health, resource, eatMe);
    }

    @Override
    public void eat() {
        this.weight += 14;
        if (this.weight < startHealth){
            this.health += 14;
        }
    }
}
