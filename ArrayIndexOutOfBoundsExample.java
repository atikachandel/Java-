
//Q3. Write a java program to generate an array index out of bound exception and handle it using catch statement.
package lab8;
public class ArrayIndexOutOfBoundsExample {

    public static void main(String[] args) {
        int[] array = new int[5];

        try {
            // Attempt to access an index outside the bounds of the array
            array[10] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}

