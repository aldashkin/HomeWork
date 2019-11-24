package homeWork5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

// Сосчитать частоту встречаемости слова или словосочетания в тексте (слово передается аргументом)

public class WarAndPeace {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Геннадий\\IdeaProjects\\Java\\out\\resourses\\wp.txt");
        List<String> strings = Files.readAllLines(file.toPath());
        Scanner scan = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        System.out.println("Введите слово или словосочетание:");
        String vvod = scan.nextLine();
        int sum = 0;
        for (String line : strings) {
            line = line.replaceAll("\\p{Punct}", ""); // убираем знаки препинания
            line = line.toLowerCase(); // нижний регистр
            if (!line.equals(""))
                words.addAll(Arrays.asList(line.split(" ")));
        }
        for (String word : words) {
            if (word.equals(vvod))
                sum++;
        }
        System.out.println("Количество слов или словосочетаний" + " '" + vvod + "' " + "в тексте: " + sum);
    }

    // Собрать все слова в группы по количеству букв

//    HashMap<Integer, HashSet<String>> groupMap = new HashMap<>();
//        for(String word){
//        int len = word.length();
//        if (!groupMap.containsKey(len)){
//            groupMap.put(len, new HashSet<>());
//        }
//        groupMap.get(len).add(word);
//    }
}