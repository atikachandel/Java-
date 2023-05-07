// Define the interface
interface Motor {
    int capacity = 10; // data member
    
    void run();// method to run the motor
    void consume(); // method to consume power
}

// Define the class that implements the interface
class WashingMachine implements Motor {
    // Implement the methods of the interface
    public void run() {
        System.out.println("Washing machine is running.");
    }
    
    public void consume() {
        System.out.println("Washing machine is consuming power.");
    }
}

// Create an object of the WashingMachine class to access the capacity data member
public class Ques2 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        System.out.println("Capacity of the washing machine is " + Motor.capacity);
    }
}

