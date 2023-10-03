package eleven;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class DateAndCalendarFromUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя данные для создания объекта Date
        System.out.println("Введите год, месяц и день (в формате ГГГГ ММ ДД):");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        // Запрашиваем у пользователя данные для создания объекта Calendar
        System.out.println("Введите часы и минуты (в формате ЧЧ ММ):");
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();

        // Создаем объект Date
        Date date = createDate(year, month, day);

        // Создаем объект Calendar
        Calendar calendar = createCalendar(year, month, day, hours, minutes);

        // Выводим полученные объекты
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat CalendarFormat = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Объект Date: " + dateFormat.format(date));
        System.out.println("Объект Calendar: " + CalendarFormat.format(calendar.getTime()));

        scanner.close();
    }

    private static Date createDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        return calendar.getTime();
    }

    private static Calendar createCalendar(int year, int month, int day, int hours, int minutes) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hours, minutes);
        return calendar;
    }
}