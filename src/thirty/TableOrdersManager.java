package thirty;

import java.util.HashMap;
import java.util.ArrayList;

public class TableOrdersManager implements OrdersManager {

    private HashMap<Integer, Order> orders;

    public void setOrders(HashMap<Integer, Order> orders) {
        this.orders = orders;
    }

    public void add(Order order, int tableNumber) {
        orders.put(tableNumber, order);
    }

    public void addItem(MenuItem item, int tableNumber) {
        orders.get(tableNumber).add(item);
    }

    public int freeTableNumber() {

        //idk what that does
        return 0;
    }

    public int[] freeTableNumbers() {
        orders.clear();
        return new int[0];
    }

    public void getOrder(int tableNumber) {
        Order order = orders.get(tableNumber);
        MenuItem[] items = order.getItems();

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].getName() + " " + items[i].getDescription() +
                    " " + items[i].getCost() + " \n");
        }
    }

    public void remove(int tableNumber) {
        orders.remove(tableNumber);
    }

    public void remove(Order order) {
        Integer[] keys = orders.keySet().toArray(new Integer[0]);
        for (int i = 0; i < keys.length; i++){
            if (orders.get(keys[i]).equals(order)){
                orders.remove(keys[i]);
            }
        }
    }

    public void removeAll(Order order) {
        Integer[] keys = orders.keySet().toArray(new Integer[0]);
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < keys.length; i++){
            if (orders.get(keys[i]).equals(order)) {
                numbers.add(keys[i]);
            }
        }

        for (int i = 0; i< numbers.size(); i++) {
            orders.remove(numbers.get(i));
        }
    }

    public
}
