

// Main class
import general.Employee;
import marketing.SalesPerson;

public class main {
    public static void main(String[] args) {
        SalesPerson sp = new SalesPerson();
        sp.setEmpID(101);
        sp.setEName("John");
        double basic = 10000;
        double ta = 8000;
        double hra = 1500;
        double totalEarning = sp.earning(basic, ta, hra);
        double totalAllowances = sp.total_allowances(basic, ta, hra);
        System.out.println("EmpID: " + sp.empID);
        System.out.println("Employee Name: " + sp.getEName());
        System.out.println("Total Earnings: " + totalEarning);
        System.out.println("Total Allowances: " + totalAllowances);
    }
}
