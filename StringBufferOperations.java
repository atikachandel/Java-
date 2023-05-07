package lab8;
import java.util.Scanner;

public class StringBufferOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the string from the user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Reverse the string
        StringBuffer b = new StringBuffer(str);
        // Insert a string into another string
        System.out.print("Enter another string to insert: ");
        String strToInsert = sc.nextLine();
        System.out.print("Enter the index to insert at: ");
        int insertIndex = sc.nextInt();
        b.insert(insertIndex, strToInsert);
        System.out.println("String after insertion: " + b.toString());
        b.reverse();
        System.out.println("Reversed string: " + b.toString());
        sc.close();
    }
}
