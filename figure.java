//Q1. A plastic manufacturer sells plastic in different sets like 2D sheet and 3D box. The cost of sheet is
//40 Rupees/sq feet and the cost of the box is 60 rupees/ cubic feet. Implement it to calculate the cost of
//plastic as per the dimensions given by the user where 3D inherits from 2D.
import java.util.Scanner;
class figure{
    double area;
    double length;
    double width;
    double height;

    figure(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double Area() {
        return Area();
    }
}

class rectangle extends figure {
    rectangle(double length, double width) {
        super(length, width, 0);
        area = length * width;
    }

    @Override
    double Area() {
        return area;
    }
}

class triangle extends figure {
    triangle(double length, double width, double height) {
        super(length, width, height);
        area = length * height * 0.5;
    }

    @Override
    double Area() {
        return area;
    }
}

public class figure{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.println("Enter the dimensions of the plastic (in feet):");
        System.out.print("Length: ");
        double length = i.nextDouble();
        System.out.print("Width: ");
        double width = i.nextDouble();
        System.out.print("Height: ");
        double height = i.nextDouble();

        rectangle r = new rectangle(length, width);
        triangle t = new triangle(length,width,height);

        double area1 = r.Area();
        double area2 = t.Area();
        System.out.println("Area of rectangle is " +area1);
        System.out.println("Area of triangle is " +area2);
    }      
}

