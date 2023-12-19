package thirty;


import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    static void printMenu() {
        System.out.println("Выберите что будем делать: ");
        System.out.println("1) Заказать на доставку");;
        System.out.println("2) Список интернет заказов");
        System.out.println("3) Заказать в ресторане");;
        System.out.println("4) Список ресторанных заказов");
        System.out.println("5) Выход");
    }
    static void printOrders(ArrayList<Order> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Заказ № " + (i + 1) );
            list.get(i).print();
        }
    }

    public static void main(String[] args) {
        ArrayList<Order> internetOrders = new ArrayList<>();
        ArrayList<Order> restaurantOrders = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        while (true) {
            printMenu();
            int num = sc.nextInt();

            if (num == 1) {
                System.out.println("Введти позиции, которые хотите заказать");
                InternetOrder order = new InternetOrder();
                while (true) {
                    System.out.print("Введите название: ");
                    String name = sc.next();
                    System.out.print("Введите цену: ");
                    double price = sc.nextDouble();
                    System.out.print("Введите описание: ");
                    String description = sc.next();
                    order.add(new Dish(price, name, description));
                    System.out.println("Для выхода введите 'exit'");
                    String choice = sc.next();
                    if (Objects.equals(choice, "exit")) {
                        break;
                    }
                }
                internetOrders.add(order);
            }
            else if (num == 2) {
                System.out.println("Список инетернет заказов");
                printOrders(internetOrders);
            }
            if (num == 3) {
                System.out.println("Введти позиции, которые хотите заказать");
                RestaurantOrder order = new RestaurantOrder();
                while (true) {
                    System.out.print("Введите название: ");
                    String name = sc.next();
                    System.out.print("Введите цену: ");
                    double price = sc.nextDouble();
                    System.out.print("Введите описание: ");
                    String description = sc.next();
                    order.add(new Dish(price, name, description));
                    System.out.println("Для выхода введите 'exit'");
                    String choice = sc.next();
                    if (Objects.equals(choice, "exit")) {
                        break;
                    }
                }
                restaurantOrders.add(order);
            }
            else if (num == 4) {
                System.out.println("Список инетернет заказов");
                printOrders(restaurantOrders);
            }

            else if (num == 5) {
                break;
            }
        }

    }
}
