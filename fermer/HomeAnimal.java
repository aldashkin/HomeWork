package fermer;

public abstract class HomeAnimal implements fermer.EatAble {
    protected String name; // имя
    protected int weight; //вес
    protected int speed; //скорость
    protected int health; //здоровье
    protected int resource; //ресурсы
    protected boolean eatMe; //съеден

    public HomeAnimal(String name, int weight, int speed, int health, int resource, boolean eatMe) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.health = health;
        this.resource = resource;
        this.eatMe = eatMe;
    }

    public abstract void eat();
}
