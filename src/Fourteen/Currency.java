package Fourteen;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PriceExtractor {
    public static void main(String[] args) {
        String text = "Цены: USD 100.50, RUB 5000.00, EU 80.75 и еще USD 200.25, USD 500.5000";

        // Регулярные выражения для извлечения цен в USD, RUB и EU
        String regexUSD = "\\bUSD\\s(\\d+\\.\\d+)\\b";
        String regexRUB = "\\bRUB\\s(\\d+\\.\\d+)\\b";
        String regexEU = "\\bEU\\s(\\d+\\.\\d+)\\b";

        Pattern patternUSD = Pattern.compile(regexUSD);
        Pattern patternRUB = Pattern.compile(regexRUB);
        Pattern patternEU = Pattern.compile(regexEU);

        Matcher matcherUSD = patternUSD.matcher(text);
        Matcher matcherRUB = patternRUB.matcher(text);
        Matcher matcherEU = patternEU.matcher(text);

        while (matcherUSD.find()) {
            System.out.println("Цена в USD: " + matcherUSD.group(1));
        }

        while (matcherRUB.find()) {
            System.out.println("Цена в RUB: " + matcherRUB.group(1));
        }

        while (matcherEU.find()) {
            System.out.println("Цена в EU: " + matcherEU.group(1));
        }
    }
}