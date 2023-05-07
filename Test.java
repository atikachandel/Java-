

// Main class
import general.Employee;
import marketing.SalesPerson;

public class Test {
    public static void main(String[] args) {
        SalesPerson sp = new SalesPerson(1001, "John Doe", 50000, 40000, 7500);
        double earning = sp.earning();
        double allowances = sp.total_allowances();
        System.out.println("Employee ID: " + sp.EmpID);
        System.out.println("Total Earning: " + earning);
        System.out.println("Total Allowances: " + allowances);
    }
}