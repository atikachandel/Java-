// General package
package general;

public class Employee {
    protected int EmpID;
    private String Ename;
    protected double Basic;
    protected double TA;
    protected double HRA;

    public Employee(int id, String name, double basic, double ta, double hra) {
        this.EmpID = id;
        this.Ename = name;
        this.Basic = basic;
        this.TA = ta;
        this.HRA = hra;
    }

    public double earning() {
        double earning = Basic + TA * (0.8 * Basic + HRA * 0.15);
        return earning;
    }
}
