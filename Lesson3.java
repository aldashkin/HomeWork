package homeWork1;

import java.util.Arrays;
import java.util.StringJoiner;

public class Lesson3 {
    public static  void main (String[] args){
        // Строки
        //До 9 версии ка массив char[]
        // каждый символ занимает 2 байта
        // кодирорвка uft-16
        // Начиная с 9 версии - компактные строки. строки хранятся как массив byte
        // LATIN-1
        //UTF-16
        //byte coder;
        // byte LATIN1-1
        // byte UTF-16

        // Строки в Java неизменны и потокобезопасны
        char[] charsArr = {'j', 'a', 'v'};
        String str = new String(charsArr);
        String str1 = "Java";
        String str2 = new String("Java"); //это строка в пулл строк не попадает
        String str3 = "Java"; // эта строка не создается
        String str4 = str2.intern(); // либо создает в пуле новую строчку (если такой не было).
        // Если такая строка уже есть, то просто возвращает ссылку

        str3.codePoints().forEach(System.out::println);

        // Количество символов в строке
        System.out.println("Количество символов в строке" + str3.length());

        //сравнение строк
        str = "Java";
        str1 = "JAVA";

        System.out.println(str.equals(str1)); // false
        // сравнение без учета регистра
        System.out.println(str.equalsIgnoreCase(str1)); //true

        int compareRes = str.compareTo(str1);
        System.out.println("compareRes" + compareRes);

        compareRes = str.compareToIgnoreCase(str1);
        System.out.println("compareToIgnoreCase" + compareRes);


        // 0 - если строки равны
        // положительное число - если первая строка следует за втрой
        // отрицательное целое число - если первая строка предшествует второй

        //Поиск в строке
        System.out.println(str.startsWith("Ja")); //true
        System.out.println(str.startsWith("b")); // false

        // indexOf ("символ")-  для поиска первого вхождения указанного символа, либо подстроки (вернет индекс)
        // lastIndexOf - для поиска последнего вхождения указанного символа, либо подстроки (вернет индекс)
        // -1 - если символ или подстрока не найдены

        System.out.println(str.indexOf("v", 2));

        str = "Java Junior Developer";
        str1 = "Java";
        System.out.println(str.contains(str1)); //true
        System.out.println(str.contains(str));// false

        // Модификация строк (в результате преобразований будет создана новая строка)

        // toLowerCase() - в нижний регистр
        String lowerStr = str.toLowerCase();

        // toUpperCase() - в верхний регистр
        //trim() - убираем пробелы
        // reverse()- переворачиваем строку
        //docs.oracle.com

        String newStr = str.replace("Junior", "");
        System.out.println(newStr);

        newStr = str.replaceAll("v", "V");
        System.out.println(newStr);

        // Разделение строки
        str = "Java Junior Developer";
        // Разбивает строку, возвращает массив
        String[] strings = str.split("\\s");
        System.out.println(Arrays.toString(strings));

        //substring(int begin, int end)
        //substring(int begin) указывает индексы, а не символы
        //substring() - взятие подстроки
        System.out.println(str.substring(3, 6));

        //Конкатенция строк - это склеивание строк (эти методы работают по разному) не используем в цикле
        String concatString = "Java" + "Developer";
        System.out.println(concatString);
        concatString = concatString.concat("Developer").concat("!");
        System.out.println(concatString);

        str = "String";
        for (int i = 0; i < 7; i++) {
            str += " iteration" +i; //на каждой итерации создается объект

        }
        System.out.println(str);

        // Классы для работы со строками (с возможностью изменеия строки)
        // StringBuilder - работает быстрее, но он не потокобезопасен
        // StringBuffer - работает медленее, но он потокобезопасен
        str = "String";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        for (int i = 0; i < 7; i++) {
            stringBuilder.append("iteration").append(i);
        }
        str = stringBuilder.toString();

        // Объединение строк
        StringJoiner joiner = new StringJoiner(", "); // объединяет строки по разделителю
        joiner.add("One");
        joiner.add("Two");
        String joinString = joiner.toString();
        System.out.println(joinString);

        System.out.println(String.join(":", "One", "Two"));

        //Текстовая блоки
//        String textBlok = """
//        Строка "в кавычках"
//        с переносами
//        """;
        // System.out.println(textBlok);




    }
}
