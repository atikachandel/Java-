import java.util.Scanner;
class figure{
    double length,breadth,height;
    figure(int l,int b,int h){
        length = l;
        breadth = b;
        height = h;
    }
    void area(){
        System.out.println("Area of box is: " + length*breadth);
    }
}
class QN1{
    public static void main(String[] args) {
        int la,ba,ha;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length: ");
        la =s.nextInt();
        System.out.println("Enter breadth: ");
        ba =s.nextInt();
        System.out.println("Enter height: ");
        ha =s.nextInt();
        box box1=new box(la,ba,ha);
        box1.volume();
    }
}