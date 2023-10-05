package Fourteen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EmailValidator {
    public static void main(String[] args) {
        String emailRegex = "^(?i)[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        String email = "example.email@domain.com";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Email-адрес действителен согласно RFC 2822.");
        } else {
            System.out.println("Email-адрес не соответствует RFC 2822.");
        }
    }
}