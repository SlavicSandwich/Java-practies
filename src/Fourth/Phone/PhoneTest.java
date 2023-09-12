package Fourth.Phone;

public class PhoneTest {
  public static void main(String[] args) {
    Phone samsung = new Phone("79135304142", "samsung", "2kg");
    Phone huawei = new Phone("79132222222", "huawei", "1kg");
    Phone iphone = new Phone("89242301212", "iphone", "3kg");
    samsung.formatOutput();
    huawei.formatOutput();
    iphone.formatOutput();

    samsung.getNumber();
    huawei.getNumber();
    iphone.getNumber();

    samsung.receiveCall("Anna", "9153434343");
  }
}
