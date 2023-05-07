//Illustrate the execution of constructors in multi-level inheritance with 3 java classes. The classes are as follows:
//(a) Plate(length, width)
//(b) Box(length, width, height)
//(c) WoodBox(length, width, height, thick)

// Plate class
class Plate {
    int length;
    int width;

    // Constructor for Plate class
    public Plate(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate constructor called");
        System.out.println("Plate created with length " + length + " and width " + width);
    }
}

// Box class, inherits from Plate class
class Box extends Plate {
    int height;

    // Constructor for Box class
    public Box(int length, int width, int height) {
        super(length, width);
        this.height = height;
        System.out.println("Box constructor called");
        System.out.println("Box created with length " + length + ", width " + width + ", and height " + height);
    }
}

// WoodBox class, inherits from Box class
class WoodBox extends Box {
    int thickness;

    // Constructor for WoodBox class
    public WoodBox(int length, int width, int height, int thickness) {
        super(length, width, height);
        this.thickness = thickness;
        System.out.println("WoodBox constructor called");
        System.out.println("WoodBox created with length " + length + ", width " + width + ", height " + height + ", and thickness " + thickness);
    }
}

// Main class to test the constructors
public class ConstructorTest {
    public static void main(String[] args) {
        WoodBox wb = new WoodBox(10, 20,30, 5);
    }
}

