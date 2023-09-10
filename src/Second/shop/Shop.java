package Second.shop;

import java.util.ArrayList;

public class Shop {
    private ArrayList<String> puters = new ArrayList<String>();

    public void add(String puter) {
        puters.add(puter);
    }

    public void remove(String puter) {
        puters.remove(puter);
    }

    public boolean findPuter(String puter) {
        return puters.contains(puter);
    }
}
