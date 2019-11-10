package HomeWork4;

// создать множество чисел (Set<Integer>), занеституда 20 различных чисел. Удалить из множества все числа больше 10

import java.util.HashSet;
import java.util.Iterator;

public class Zadacha2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<Integer>(22);
        for (int i = 0; i < 20; i++){
            hashSet.add(i);
        }
        hashSet.add(-7); // проверка
        hashSet.add(-17);
        System.out.println("Множество из 22 различных чисел: " + hashSet);
        Iterator<Integer> i = hashSet.iterator();
        while (i.hasNext()){
            if (i.next() > 10){
                i.remove();
            }
        }
        System.out.println(hashSet);
    }
}
