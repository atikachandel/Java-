// Define the Employee interface
interface Employee {
    double Earning(double basic);   // Declare the "Earning" method
    double Deduction(double basic); // Declare the "Deduction" method
    double Bonus(double basic);     // Declare the "Bonus" method
  }
  
  // Define the Manager class that uses the Employee interface without implementing the Bonus method
  class Manager implements Employee {
    public double Earning(double basic) {
      return basic + (0.8 * basic) + (0.15 * basic);
    }
    
    public double Deduction(double basic) {
      return 0.12 * basic;
    }
    
    // The Bonus method is not implemented in the Manager class
    public double Bonus(double basic) {
      throw new UnsupportedOperationException("Bonus method not implemented.");
    }
  }
  
  // Define the SubStuff class that extends from Manager and implements the Bonus method
  class SubStuff extends Manager {
    public double Bonus(double basic) {
      return 0.5 * basic;
    }
  }
  
  // Main class to calculate the earning, deduction, and bonus of a SubStuff
  public class Ques3 {
    public static void main(String[] args) {
      // Prompt the user to enter the basic salary amount
      java.util.Scanner scanner = new java.util.Scanner(System.in);
      System.out.print("Enter the basic salary amount: ");
      double basic = scanner.nextDouble();
      
      // Create an object of the SubStuff class
      SubStuff ss = new SubStuff();
      
      // Calculate the earning, deduction, and bonus of the SubStuff
      double earning = ss.Earning(basic);
      double deduction = ss.Deduction(basic);
      double bonus = ss.Bonus(basic);
      
      // Print the results
      System.out.println("Earning: " + earning);
      System.out.println("Deduction: " + deduction);
      System.out.println("Bonus: " + bonus);
    }
  }
  