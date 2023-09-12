package Second.shop;

public class ShopTest {
  public static void main(String[] args) {
    Shop shop = new Shop();
    shop.add("CoolPuter");
    System.out.println(shop.findPuter("CoolPuter"));
  }

}
