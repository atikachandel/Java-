//Write a java class which has a method, ProcessInput.
//This method checks the number entered by the user. If the number is negative then
//throw an user defined exception called negative number exception otherwise
//it displays the double value of the entered number.

/*
 Write a Java class which has a method called ProcessInput(). This method
checks the number entered by the user. If the entered number is negative then throw
an user defined exception called NegativeNumberException, otherwise it displays the
double value of the entered number.
*/ 

import java.util.Scanner;

class MyException extends Exception {
}


public class negative {
    
    public static void processInput()
     {
        System.out.println("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        try{
            if (x<0) {
                throw new MyException();
            }else{
                System.out.println("Output for " + x + " is : " + 2*x);
            }
        } catch (MyException e) {
            System.out.println("Manually caught Negative Integer " + x);
        }

    }

    public static void main(String args[])
    {
        processInput();
    }
}