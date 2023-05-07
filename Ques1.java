// Define the abstract class
abstract class Student {
    int rollno;
    String regNo;

    // Abstract method
    public abstract String course();
}

// Define a subclass that extends the abstract class
class KIITIAN extends Student {
    //@Override
    public String course() {
        return "Computer Science";
    }
}

public class Ques1 {
    public static void main(String[] args) {
        // Create an instance of the KIITIAN class
        KIITIAN k = new KIITIAN();

        // Set the values of the data members
        k.rollno = 21052406;
        k.regNo = "22324424";

        // Call the course method
        String course = k.course();

        // Print the results
        System.out.println("Roll No: " + k.rollno);
        System.out.println("Registration No: " + k.regNo);
        System.out.println("Course: " + course);
    }
}
