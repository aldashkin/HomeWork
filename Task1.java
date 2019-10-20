package homeWork1;

// 1. Написать программу перевода числа из 10 системы счисления в 2 систему, в 16 систему

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in); // alt + enter -> Import Class
        System.out.println("Введите число в десятичной системе:");
        int n = in.nextInt();
        int k = n;
        StringBuilder str = new StringBuilder();
        while (n != 0){
            int b = n % 2;
            str.append("" + b);
            n = n / 2;
        }
        str.reverse();
        System.out.println("В двоичной системе: " +str);

        StringBuilder str2 = new StringBuilder();
        while (k != 0){
            int g = k % 16;
            if (g == 10){
                str2.append("" + 'A');
            }
            if (g == 11){
                str2.append("" + 'B');
            }
            if (g == 12){
                str2.append("" + 'C');
            }
            if (g == 13){
                str2.append("" + 'D');
            }
            if (g == 14){
                str2.append("" + 'E');
            }
            if (g == 15){
                str2.append("" + 'F');
            }
            if (g <= 9) {
                str2.append("" + g);
            }
            k = k / 16;
        }
        str2.reverse();
        System.out.println("В шестнадцатиричной системе: " +str2);
    }
}
