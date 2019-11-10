package HomeWork4;

// Написать программу, которая должна считывать 10 слов в свой список строк.
// Определить, является ли список упорядоченным по возрастанию строки. В случае отрицательного ответа выводить
// на экран номер первого элемента, нарушевшего такую упорядоченность

import java.util.ArrayList;

public class Zadacha {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("q");
        list.add("qw");
        list.add("qwe");
        list.add("qwer");
        list.add("qwert");
        list.add("qwerty");
        list.add("y");
        list.add("yt");
        list.add("ytr");
        list.add("ytrewq");
        System.out.println("Список" + list);
        for (int i = 0; i < 10; i++){
            if (i == 0)
                continue;
            if (list.get(i - 1).length() > list.get(i).length()){
                System.out.println(list.get(i));
            }
            //if (list.get(i - 1).length() <= list.get(i).length())
            }
        }
    }
