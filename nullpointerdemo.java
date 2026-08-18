public class NullPointerDemo {
    public static void main(String[] args) {
      
        String text = null;
        try {
            int length = text.length();
        } 
        catch (NullPointerException e) {
            System.out.println("Exception Caught: Tried to call a method on a null String.");
        }

        Customer customer = null;
        try {
            customer.getName();
        } 
        catch (NullPointerException e) {
            System.out.println("Exception Caught: Customer object is null.");
        }
      
        int[] numbers = null;
        try {
            int firstNumber = numbers[0];
        }
        catch (NullPointerException e) {
            System.out.println("Exception Caught: Array has not been initialized.");
        }
    }
}

class Customer {
    private String name = "John";
    public String getName() {
        return name;
    }
}
