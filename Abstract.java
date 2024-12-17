import java.util.Scanner;
abstract class Shape{
    abstract public void compute_area(double a,double b);
    public void calculate_area(){

    }
}

class Triangle extends Shape{
    public double base;
    public double height;
    public void compute_area(double a,double b){
        this.base=a;
        this.height=b;
    }
    public void calculate_area(){
        System.out.println("Area of triangle"+(0.5*(base*height)));
    }
}

class Rectangle extends Shape{
    public double length;
    public double breadth;
    public void compute_area(double a,double b){
        this.length=a;
        this.breadth=b;
    }
    public void calculate_area(){
        System.out.println("Area of rectangle"+(length*breadth));
    }

}
class Abstract{
    public static void main(String[]args){
        double base,height;
        double length,breadth;

        Shape obj1=new Triangle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base value");
        base=sc.nextDouble();
        System.out.println("Enter height value");
        height=sc.nextDouble();
        obj1.compute_area(base,height);
        obj1.calculate_area();

        Shape obj2=new Rectangle();
        System.out.println("Enter length value");
        length=sc.nextDouble();
        System.out.println("Enter breadth value");
        breadth=sc.nextDouble();
        obj2.compute_area(length,breadth);
        obj2.calculate_area();

    }
}