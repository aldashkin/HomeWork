package homeWork1;

// 2. Дан массив целых чисел. Масив не отсортирован, числа могут повторяться. Необходимо найти в данном массиве
// такие два числа n m, чтобы их сумма была равна 7.
// 2+5=7, 6+1=7, -2+9=7
//

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] massive = new int[15];
        for (int i = 0; i < massive.length; i++){
            massive [i] = rand.nextInt(10);


            //System.out.println(rand.nextInt(10));
//            System.out.println((int) (Math.random()));
        }
        System.out.println(Arrays.toString(massive));
        for(int i = 0; i < massive.length; i++) {
            int a = massive[i];
            for (int j = i + 1; j < massive.length; j++) {
                int b = massive[j];
                int num = a + b;
                if (num == 7) {
                    //System.out.println(a & b);
                    System.out.println("a="+ a + " Индекс элемента: " + i);
                    System.out.println("b="+ b + " Индекс элемента: "+ j);
                    System.out.println("_____");
                }

            }
        }
    }
}
