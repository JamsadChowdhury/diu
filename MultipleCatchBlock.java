public class MultipleCatchBlock {

    public static void main(String[] args) {
      
        int a[] = new int[2];
      
        try {
          
            System.out.println("Print 3'rd Element: " + a[3]);
        }
        catch (ArithmeticException e) {
          
            System.out.println("Arithmetic Exception!");
        }
        catch (ArrayIndexOutOfBoundsException e1) {
          
            System.out.println("Array Index Out Of Bounds Exception");
        }
        catch (NullPointerException e2) {
          
            System.out.println("Null Pointer Exception");
        }
    }
}
