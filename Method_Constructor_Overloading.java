import java.util.*;
class Hello{
Hello(){
    System.out.println("This is a default constructor");
}
Hello(int a)
{
    System.out.println("This constructor has 1 parameter");
}
void method()
{
    System.out.println("You are in method having 0 parameters");
}
void method(int a)
{
    System.out.println("You are in a method having 1 parameter.");
}
            }
            
class overloading
{
    public static void main(String args[])
    { Hello ob= new Hello();
           ob =new Hello(8);
           ob.method();
           ob.method(8);
    }
}
