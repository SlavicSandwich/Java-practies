package Fourteen;

public class Date {
    public static void main(String[] args) {
        String dateRegex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19\\d{2}|[2-9]\\d{3})$";
        String inputDate = "31/12/1899";

        if (inputDate.matches(dateRegex)) {
            System.out.println("Дата действительна в заданном формате.");
        } else {
            System.out.println("Дата не соответствует заданному формату.");
        }
    }
}
