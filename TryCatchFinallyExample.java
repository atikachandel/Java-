//Q4.  WAJP to illustrate try, catch and finally.
package lab8;
public class TryCatchFinallyExample {

    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the exception and handle it
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            // Code that will always execute, whether an exception was thrown or not
            System.out.println("This code is always executed.");
        }
    }
}
