package Fourteen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class DigitWithoutPlusCheck {
    public static void main(String[] args) {
        String text = "Текст с цифрами: 123, 45, 678 +, 9, 10";

        // Регулярное выражение для поиска цифр без знака "+"
        String regex = "\\b\\d+\\b (\\+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Найдена цифра со знаком '+': " + matcher.group());
        }
    }
}