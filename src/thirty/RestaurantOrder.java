package thirty;

import java.util.ArrayList;

public class RestaurantOrder implements Order{
    ArrayList<Item> items = new ArrayList<>();
    // Код класса RestaurantOrder и его реализация методов
    @Override
    public boolean add(Item item) {
        items.add(item);
        return true;
    }

    @Override
    public boolean remove(String itemName) {
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        return 0;
    }

    @Override
    public int getOrderSize() {
        return 0;
    }

    @Override
    public Item[] getItems() {
        return new Item[0];
    }

    @Override
    public double getTotalCost() {
        return 0;
    }

    @Override
    public int getQuantity(String itemName) {
        return 0;
    }

    @Override
    public String[] getItemNames() {
        return new String[0];
    }

    @Override
    public Item[] getSortedItemsByPrice() {
        return new Item[0];
    }

    public void print(){
        for (int i = 0; i < items.size(); i++){
            Item current = items.get(i);
            System.out.println(current.getDescription() + " " + current.getName() + " " + current.getCost() + " рублей");

        }
    }
}
