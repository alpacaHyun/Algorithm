package programmers.level1;

import java.time.LocalDate;
import java.util.Arrays;

public class Date20160101 {

    public static void main(String[] args) {
        System.out.println(solution(5,24));
    }

    public static  String solution(int a, int b) {
        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0, 3);
    }

}

//
//enum Date {
//    JAN("1", 31),
//    FEB("2", 29),
//    MAR("3", 31),
//    APR("4",30),
//    MAY("5",31),
//    JUN("6",30),
//    JUL("7", 31),
//    AUG("8", 31),
//    SEP("9",30),
//    OCT("10",31),
//    NOV("11",30),
//    DEC("12",31),
//    EMPTY("0",0);
//
//    private final String month;
//    final int day;
//
//    Date(String month, int day) {
//        this.month = month;
//        this.day = day;
//    }
//
//    public static int fromDay(String month) {
//        return Arrays.stream(Date.values())
//                .filter(date -> date.month.equals(month))
//                .map(date -> date.day)
//                .findAny()
//                .orElse(EMPTY.day);
//    }
//
//    public int getDay(String month){
//        return Date.fromDay(month);
//    }
//}
//
//public enum DayOfTheWeek {
//    FRI("0", "FRI"),
//    SAT("1", "SAT"),
//    SUN("2", "SUN"),
//    MON("3", "MON"),
//    TUE("4", "TUE"),
//    WED("5","WED"),
//    THU("6", "THU"),
//    EMPTY("0", "0"),;
//
//    private final String day;
//    private final String dayOfWeek;
//
//    DayOfTheWeek(String day, String dayOfWeek) {
//        this.day = day;
//        this.dayOfWeek = dayOfWeek;
//    }
//
//    public static String fromDay(String day) {
//        return Arrays.stream(Date.values())
//                .filter(dayOfTheWeek -> dayOfTheWeek.day.equals(day))
//                .
//
//    }
//
//    public String getDay(String day){
//        return DayOfTheWeek.fromDay(day);
//    }
//
//
//}
