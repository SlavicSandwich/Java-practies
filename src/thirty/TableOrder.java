package thirty;
import java.util.ArrayList;
import java.util.Objects;

public class TableOrder implements Order{
    private int size;
    private ArrayList<MenuItem> items = new ArrayList<>();
    private Customer customer = null;

    @Override
    public boolean add(MenuItem item) {
        items.add(item);
        return true;
    }

    @Override
    public String[] itemsNames() {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < items.size(); i++){
            names.add(items.get(i).getName());
        }
        String[] arr = new String[names.size()];
        return names.toArray(arr);
    }

    @Override
    public int itemQuantity(String itemName) {
        int sum = 0;
        for (int i = 0; i < items.size(); i++){
            if (Objects.equals(items.get(i).getName(), itemName)){
                sum++;
            }
        }
        return sum;
    }

    @Override
    public int itemQuantity(MenuItem item) {
        int sum = 0;
        for (MenuItem menuItem : items) {
            if (menuItem.equals(item)) {
                sum++;
            }
        }
        return sum;
    }

    @Override
    public int itemsQuantity() {
        int sum = 0;
        for (MenuItem menuItem : items) {
            sum++;
        }
        return sum;
    }

    @Override
    public MenuItem[] getItems() {
        MenuItem[] arr = new MenuItem[items.size()];
        return items.toArray(arr);
    }

    @Override
    public boolean remove(String itemName) {
        for (int i = 0; i < items.size(); i++){
            if (Objects.equals(items.get(i).getName(), itemName)){
                items.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        for (int i = 0; i < items.size(); i++){
            if (items.get(i).equals(item)){
                items.remove(i);
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean removeAll(MenuItem item) {
        int count = 0;
        for (MenuItem menuItem : items) {
            if (menuItem.equals(item)) {
                count++;
            }
        }

        if (count == 0){
            return false;
        }

        for (int i = 0; i < count; i++){
            remove(item);
        };
        return true;
    }

    @Override
    public boolean removeAll(String itemName) {
        int count = 0;
        for (int i = 0; i < items.size(); i++){
            if (Objects.equals(items.get(i).getName(), itemName)){
                count++;
            }
        }

        if (count == 0){
            return false;
        }

        for (int i = 0; i < count; i++){
            remove(itemName);
        };
        return true;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] arr = new MenuItem[items.size()];
        return items.toArray(arr);
    }

    @Override
    public int costTotal() {
        int sum = 0;
        for (int i = 0; i < items.size(); i++){
            sum += items.get(i).getCost();
        }
        return sum;
    }

    @Override
    public Customer getCustomer() {
        return this.customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    @Override
    public boolean equals(Order order){
        MenuItem[] arr1 = getItems();
        MenuItem[] arr2 = getItems();

        if (arr1.length != arr2.length)
            return false;


        for (int i = 0; i < arr1.length; i++){
            if (!Objects.equals(arr1[i].getName(), arr2[i].getName())){
                return false;
            }
        }
        return true;
    }
}
