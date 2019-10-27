package HomeWork2;

public class Cat {
    public String name; // имя кота
    public int weight; // вес кота
    public int age; // возраст кота
    public String color; // цвет кота
    public String address; // адрес владельца

    // конструкторы

    public Cat(String name, String color){
        setName(name); // имя, цвет
        setColor(color);
    }

    public Cat(String name, int weight, int age){
        setName(name); // имя, вес, возраст
        setWeight(weight);
        setAge(age);
    }
    public Cat(String name, int age){
        setName(name); // имя, возраст
        setAge(age);
    }
    public Cat(int weight, String color){
        setWeight(weight); // Вес, цвет
        setColor(color);
    }
    public Cat(int weight, String color, String address){
        setWeight(weight); // вес, цвет, адрес владельца
        setColor(color);
        setAddress(address);
    }

    // Геттеры и сеттеры

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getWeight() {

        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
