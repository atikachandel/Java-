// WAP to create an account class containing account no.,balance as data members and DISP to display the details.
//Inherit it in person class with all data member and functions.Person class also have name and aadhar
//number as extra data member. Overwrite DISP function and create 5 persons details.
class Account {
    int accountNo;
    double balance;

    Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void DISP() {
        System.out.println("Account No.: " + accountNo);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadharNo;

    Person(int accountNo, double balance, String name, String aadharNo) {
        super(accountNo, balance);
        this.name = name;
        this.aadharNo = aadharNo;
    }

    void DISP() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar No.: " + aadharNo);
        super.DISP();
    }
}

public class Ques4 {
    public static void main(String[] args) {
        Person p1 = new Person(12345, 10000, "John", "1234567890");
        Person p2 = new Person(23456, 5000, "Jane", "0987654321");
        Person p3 = new Person(34567, 20000, "Mike", "5678901234");
        Person p4 = new Person(45678, 15000, "Sarah", "4321098765");
        Person p5 = new Person(56789, 30000, "David", "9012345678");

        p1.DISP();
        System.out.println();
        p2.DISP();
        System.out.println();
        p3.DISP();
        System.out.println();
        p4.DISP();
        System.out.println();
        p5.DISP();
        System.out.println();
    }
}



