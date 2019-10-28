package fermer;

abstract public class HomeAnimal extends Animal {

    protected int resources;
    protected  String name;

    public HomeAnimal(int speed, int health, int resources, String name) {
        super(speed, health, resources);
        this.resources = resources;
        this.name = name;
    }
}
