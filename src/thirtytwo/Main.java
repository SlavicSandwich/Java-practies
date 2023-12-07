package thirtytwo;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Address address = new Address("Mooscow", 119261, "Vernadskogo", 78, 'a');
        Drink drink = new Drink(100, "Cola", "Very tasty drink");

        SerializationUtils.serialize(address, "address.ser");
        SerializationUtils.serialize(drink, "drink.ser");

        Address deserializedAddress = (Address) SerializationUtils.deserialize("address.ser");
        System.out.println("Deserialized Address: " + deserializedAddress);

        Drink deserializedDrink = (Drink) SerializationUtils.deserialize("drink.ser");
        System.out.println("Deserialized OrderManager: " + deserializedDrink);

    }
}
