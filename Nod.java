package homeWork1;

// Найти НОД двух чисел

import java.util.Scanner;

public class Nod {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in); // alt + enter -> Import Class
        System.out.println("Введите первое  положительное число в десятичной системе:");
        int a = in.nextInt();
        Scanner inn = new Scanner (System.in); // alt + enter -> Import Class
        System.out.println("Введите второе положительное число в десятичной системе:");
        int b = inn.nextInt();
//        while (true) {
//            if (a > b) {
//                a = a % b;
//            }
//            if (a < b) {
//                b = b % a;
//            }
//            if (a == b) {
//                System.out.println("Нод a и b:" +a);
//                break;
//            }
//        }
        // Не работает с остатком от деления :(
        while (a != b){
            if (a > b){
                a = a - b;
            }
            else  {
                b = b - a;
            }
        }
        System.out.println("Нод a и b:" +a);
    }
}
