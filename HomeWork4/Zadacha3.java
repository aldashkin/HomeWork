package HomeWork4;

//Считывание 20 чисел, сохранение их в список, сортировка по трем другим спискам:число нацело делится на 3,
//нацело делитя на 2 и все остальные. Числа, которые делятся на 2 и 3 одновременно, попадают в оба списка.
//Метод printList() должен выводить на экран все элементы всех списков с новой строки. Метод printList(String listName)
// должен выводить на экран все элементы указанного списка.

import java.util.ArrayList;
import java.util.List;

public class Zadacha3 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> div3 = new ArrayList<Integer>();
        ArrayList<Integer>  div2= new ArrayList<Integer>();
        ArrayList<Integer> div23 = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++){
            list.add(i);
        }
        System.out.println("Полный список: " + list);

        for (int i=0; i < list.size(); i++){
            int x = list.get(i);
            if (x%3 == 0) div3.add(x);
            if (x%2 == 0) div2.add(x);
            if (x%2 != 0 && x%3 != 0) div23.add(x);
        }
        System.out.println("Список чисел, которые делятся на 3:");
        printList(div3);
        System.out.println("Список чисел, которые делятся на 2:");
        printList(div2);
        System.out.println("Список остальных чисел: ");
        printList(div23);
    }

    private static void printList(List<Integer> list) {

        System.out.println(list);
 }
}