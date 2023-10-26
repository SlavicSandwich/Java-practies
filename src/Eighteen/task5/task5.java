package Eighteen.task5;


class Task5 {
    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println("Attempted to use null as the key");
        }
    }
    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
        //do something with the key
    }
}
class TaskTest5 {
    public static void main(String[] args) {
        Task5 exceptionTest = new Task5();
        exceptionTest.printMessage("pupupu");
        exceptionTest.printMessage(null);
    }
}