package HomeWork2;

import java.util.Scanner;

public class Maincat {
    public static void main(String[] args) {
        Cat murka = new Cat("Murka", "blue");
        Cat burka = new Cat("Burka", 9, 9);
        Cat barsik = new Cat("Barsik", 4);
        Cat boris = new Cat( 7,"red");
        Cat kisa = new Cat(5, "black", "street");
        System.out.println("Введите имя кота:");
        Scanner in = new Scanner(System.in);
        if("murka".equals(in.next())){
            System.out.println(murka.toString());
        }else if("burka".equals(in.next())){
            System.out.println(burka.toString());
        }else if("barsik".equals(in.next())){
            System.out.println(barsik.toString());
        }else if("boris".equals(in.next())){
            System.out.println(boris.toString());
        }else if("kisa".equals(in.next())){
            System.out.println(kisa.toString());
        }
    }
}