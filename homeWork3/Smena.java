package homeWork3;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Smena {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Сейчас: " + currentTime); // Выводим местное время
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmm"); //формат для времени без двоеточия
        String strNow = formatter.format(currentTime); // время в строку
        int now = Integer.parseInt(strNow); // строку в число

        // определяем смену
        if(now >= 700 && now < 1500){
            System.out.println("Первая смена");
        }
        else if (now >= 1500 && now < 2300){
            System.out.println("Вторая смена");
        }
        else if ((now >= 0 && now < 700) || now >= 2300){
            System.out.println("Третья смена");
        }
    }
}
