package twentyfive;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class IPAddressValidator {

    private static final String IP_ADDRESS_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    private static final Pattern pattern = Pattern.compile(IP_ADDRESS_PATTERN);

    public static boolean isValidIPAddress(String ipAddress) {
        Matcher matcher = pattern.matcher(ipAddress);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String ipAddress1 = "192.168.1.1";
        String ipAddress2 = "255.144.1455.1";
        String ipAddress3 = "abc.def.ghi.jkl";

        System.out.println(ipAddress1 + " is valid: " + isValidIPAddress(ipAddress1));
        System.out.println(ipAddress2 + " is valid: " + isValidIPAddress(ipAddress2));
        System.out.println(ipAddress3 + " is valid: " + isValidIPAddress(ipAddress3));
    }
}
