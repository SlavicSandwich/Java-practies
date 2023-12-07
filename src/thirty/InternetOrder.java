package thirty;

import java.util.ArrayList;
import java.util.Objects;

public class InternetOrder implements Order {

    private int size;
    private ListNode head;
    private ListNode tail;
    private Customer customer = null;

    @Override
    public boolean add(MenuItem item) {
        ListNode newitem = new ListNode();
        newitem.setValue(item);
        tail.setNext(newitem);
        tail = tail.getNext();
        return true;
    }

    @Override
    public String[] itemsNames() {
        ArrayList<String> names = new ArrayList<>();
        ListNode cur = head;
        while (cur != null){
            names.add(cur.getValue().getName());
            cur = cur.getNext();
        }
        String[] arr = new String[names.size()];
        return names.toArray(arr);
    }

    @Override
    public int itemQuantity(String itemName) {
        int sum = 0;
        ListNode cur = head;

        while (cur != null){
            if (Objects.equals(cur.getValue().getName(), itemName)){
                sum++;
            }
            cur = cur.getNext();
        }
        return sum;
    }

    @Override
    public int itemQuantity(MenuItem item) {
        int sum = 0;
        ListNode cur = head;

        while (cur != null){
            if (cur.getValue().equals(item)){
                sum++;
            }
            cur = cur.getNext();
        }
        return sum;
    }

    @Override
    public MenuItem[] getItems() {
        int count = 0;
        ListNode cur = head;
        ArrayList<MenuItem> items = new ArrayList<>();
        while (cur != null){
            items.add(cur.getValue());
            cur = cur.getNext();
        }
        MenuItem[] arr = new MenuItem[items.size()];

        return items.toArray(arr);
    }

    @Override
    public boolean remove(String itemName) {

        ListNode cur = head;

        while (cur != null){
            if (Objects.equals(cur.getValue().getName(), itemName)){
                cur.setNext(cur.getNext().getNext());
                return true;
            }
            cur = cur.getNext();
        }
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        ListNode cur = head;

        while (cur != null){
            if (cur.getValue().equals(item)){
                cur.setNext(cur.getNext().getNext());
                return true;
            }
            cur = cur.getNext();
        }
        return false;
    }


    @Override
    public boolean removeAll(MenuItem item) {
        ListNode cur = head;
        boolean flag = false;
        while (cur != null){
            if (cur.getValue().equals(item)){
                cur.setNext(cur.getNext().getNext());
                flag = true;
            }
            cur = cur.getNext();
        }
        return flag;
    }

    @Override
    public boolean removeAll(String itemName) {
        ListNode cur = head;
        boolean flag = false;
        while (cur != null){
            if (Objects.equals(cur.getValue().getName(), itemName)){
                cur.setNext(cur.getNext().getNext());
                flag = true;
            }
            cur = cur.getNext();
        }
        return flag;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        int count = 0;
        ListNode cur = head;
        ArrayList<MenuItem> items = new ArrayList<>();
        while (cur != null){
            items.add(cur.getValue());
            cur = cur.getNext();
        }
        MenuItem[] arr = new MenuItem[items.size()];

        return items.toArray(arr);
    }

    @Override
    public int costTotal() {
        int sum = 0;
        ListNode cur = head;
        while (cur != null){
            sum += cur.getValue().getCost();
            cur = cur.getNext();
        }
        return sum;
    }

    @Override
    public int itemsQuantity() {
        int count = 0;
        ListNode cur = head;
        ArrayList<MenuItem> items = new ArrayList<>();
        while (cur != null){
            items.add(cur.getValue());
            cur = cur.getNext();
        }
        MenuItem[] arr = new MenuItem[items.size()];

        return items.toArray(arr).length;
    }

    @Override
    public boolean equals(Order order) {
        MenuItem[] arr1 = getItems();
        MenuItem[] arr2 = order.getItems();

        if (arr1.length != arr2.length)
            return false;


        for (int i = 0; i < arr1.length; i++){
            if (!Objects.equals(arr1[i].getName(), arr2[i].getName())){
                return false;
            }
        }
        return true;

    }

    @Override
    public Customer getCustomer() {
        return this.customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
