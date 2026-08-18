public class NegativeArraySizeDemo {
  
    public static void main(String[] args) {
      
        try {
            int size = -5;
            
            int[] numbers = new int[size]; 

        }
        catch (NegativeArraySizeException e) {
          
            System.out.println("Exception Caught: Array size cannot be negative!");
            System.out.println("Exception Details: " + e.toString());
        }
    }
}
