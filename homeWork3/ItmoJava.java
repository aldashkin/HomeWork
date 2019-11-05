package homeWork3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.DayOfWeek.*;

public class ItmoJava {
    public static void main(String[] args) {

        LocalDate start = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        LocalDateTime end = LocalDateTime.of(2020, Month.JANUARY, 20, 22, 0);

        System.out.println("Сегодня у нас: " + formatter.format(start)); //выводим сегодняшнюю дату
        System.out.println("Дата окончания занятий: " + formatter.format(end)); //выводим дату окончания занятий

        int i = 0;
        for (LocalDate date = start; date.isBefore(ChronoLocalDate.from(end)); date = date.plusDays(1)) {
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            if(dayOfWeek == MONDAY || dayOfWeek == WEDNESDAY || dayOfWeek == FRIDAY){
                i = i + 1;
            }
        }
        System.out.println("Количество занятий осталось: " + i);
    }
}
