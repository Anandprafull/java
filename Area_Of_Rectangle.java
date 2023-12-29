import java.util.*;
class arearect
{
    int l,b;
    arearect(int a,int x)
    {
        l=a;
        b=x;
        this.arearect(l,b);
    }
    void arearect(int a,int b)
    {
        System.out.println("Area of Reactangle:"+(a*b));
    }
}
class Rectangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle: ");
        int l =sc.nextInt();
        int b=sc.nextInt();
        arearect ob=new arearect(l,b);
    }
}
