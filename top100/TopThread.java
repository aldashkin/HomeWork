package top100;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class TopThread {

    public static void main(String[] args) {
        Map<String, Integer> map = Collections.synchronizedMap(new HashMap<>());

        FileClass fileClass = new FileClass();
        List<String> strings = fileClass.strings;

        int threadCount = Runtime.getRuntime().availableProcessors();
        System.out.println("Всего потоков: " + threadCount);

        ExecutorService service = Executors.newFixedThreadPool(threadCount);
        for (String s : strings) {
            service.execute(new Top100Thread(s, map));
        }
        service.shutdown();

        while (!service.isTerminated()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        ArrayList<Map.Entry<String, Integer>> entryArrayList = fileClass.getTreeMap(map);
        for (int i = 0; i < 100; i++) {
            System.out.println(entryArrayList.get(entryArrayList.size() - 1 - i));
        }
    }

    public static class Top100Thread implements Runnable {
        private String string;
        Map<String, Integer> word;

        public Top100Thread(String string, Map<String, Integer> map) {
            this.string = string;
            this.word = map;
        }

        @Override
        public void run() {
            ArrayList<String> arrayList = new ArrayList<>();
            String[] array = string.split(" ");
            for (String value : array) {
                arrayList.add(value.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
            }
            for (String s : arrayList) {
                if (s.length() > 0) {
                    if (!word.containsKey(s)) {
                        word.put(s, 1);
                    } else {
                        word.put(s, word.get(s) + 1);
                    }
                }
            }
        }
    }
}

class FileClass {
    private File file = new File("resurses/wp.txt");
    //private File file = new File("resurses/file.txt");
    List<String> strings;

    {
        try {
            strings = Files.readAllLines(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    ArrayList<Map.Entry<String, Integer>> getTreeMap(Map<String, Integer> map) {
        ArrayList<Map.Entry<String, Integer>> listOfEntries = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            listOfEntries.add(entry);
        }
        Comparator<Map.Entry<String, Integer>> comparator = new MapComparator();
        listOfEntries.sort(comparator);
        return listOfEntries;
    }
}

class MapComparator implements Comparator<Map.Entry<String, Integer>> {

    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return Integer.compare(o1.getValue(), o2.getValue());
    }
}