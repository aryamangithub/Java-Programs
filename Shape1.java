// shape class
// do doubke values that stores area of figures
// derive two specific class rectangle and triangle 
// add to the base class , member function get_data() to initiate base class data members and another member function display_area()
// compute and display the area of figures 
// overrode display_area() and refine this function in the derived classes to suit their requirements. 
import java.util.Scanner;
class shape
{
    double x; 
    double y;
    Scanner sc = new Scanner(System.in);
    void get_data(){
            System.out.println("Enter side 1 :");
            float a = sc.nextFloat();
            System.out.println("Enter side 2 :");
            float b = sc.nextFloat();
            x = a;
            y = b;
    }
    void display_area(){
        System.out.println("area function in base classs");
    }
}
class triangle extends shape
{
    void display_area(){
        System.out.println("Area of triangle: " +((x*y)/2));
    }
}
class rectangle extends shape
{
    void display_area(){
        System.out.println("Area of rectangle: " +(x*y));
    }
}
class circle extends shape{
    void get_data(){
        System.out.println("Enter radius :");
        float a = sc.nextFloat();
        x = a;
    }
    void display_area(){
        System.out.println("Area of circle : " +(3.14*x*x));
    }
}
class Main
{
    public static void main(String args[]) {
        
        triangle obj = new triangle();
        obj.get_data();       
        obj.display_area();
        
        rectangle obj1 = new rectangle();
        obj1.get_data();
        obj1.display_area();

        circle obj2 = new circle();
        obj2.get_data();
        obj2.display_area();
    }
}

