// Marketing package
package marketing;

import general.Employee;

public class SalesPerson extends Employee {
    public SalesPerson(int id, String name, double basic, double ta, double hra) {
        super(id, name, basic, ta, hra);
    }

    public double total_allowances() {
        double allowances = earning() * 0.05;
        return allowances;
    }
}
