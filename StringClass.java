package lab8;
import java.util.Scanner;

public class StringClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the first string from the user
        System.out.print("Enter a string: ");
        String str1 = sc.nextLine();

        // Change the case of the string
        String str1Upper = str1.toUpperCase();
        String str1Lower = str1.toLowerCase();
        System.out.println("Uppercase: " + str1Upper);
        System.out.println("Lowercase: " + str1Lower);

        // Read the second string from the user
        System.out.print("Enter another string: ");
        String str2 = sc.nextLine();

        // Compare two strings
        boolean equalStrings = str1.equals(str2);
        int compareToValue = str1.compareTo(str2);

        if (equalStrings) {
            System.out.println("The two strings are equal.");
        } else {
            System.out.println("The two strings are not equal.");
        }

        if (compareToValue == 0) {
            System.out.println("The two strings are equal.");
        } else if (compareToValue < 0) {
            System.out.println("The first string is smaller than the second string.");
        } else {
            System.out.println("The first string is greater than the second string.");
        }

        sc.close();
    }
}
