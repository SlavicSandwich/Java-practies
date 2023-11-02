package twentyone.Task2;

class GenericArray<T> {
    private T[] array;

    public GenericArray(int size) {
        array = (T[]) new Object[size];
    }

    public void set(int index, T value) {
        if (index >= 0 && index < array.length) {
            array[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public T get(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public int size() {
        return array.length;
    }

    public static void main(String[] args) {
        GenericArray<Integer> integerArray = new GenericArray<>(5);
        integerArray.set(0, 1);
        integerArray.set(1, 2);
        integerArray.set(2, 3);
        integerArray.set(3, 4);
        integerArray.set(4, 5);

        for (int i = 0; i < integerArray.size(); i++) {
            System.out.println(integerArray.get(i));
        }

        GenericArray<String> stringArray = new GenericArray<>(3);
        stringArray.set(0, "Konichiva");
        stringArray.set(1, "Hello");
        stringArray.set(2, "Hola");

        for (int i = 0; i < stringArray.size(); i++) {
            System.out.println(stringArray.get(i));
        }
    }
}