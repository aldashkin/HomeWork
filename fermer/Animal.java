package fermer;

public class Animal {
    protected int health;
    protected int speed;
    protected int weight;

    public Animal(int speed, int weight, int health){
        this.speed = speed;
        this.health = health;
        this.weight = weight;
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getHealth(int health){
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public int getWeight(int weight){
        return weight;
    }
    public void setWeight(int weight){
        this.health = weight;
    }
    public boolean isAlive(){
        return  health > 0;
    }
    public   void run(){
        System.out.println("Животное перемещается со скоростью" + speed);

    }

}
