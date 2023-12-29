import java.util.*;
class iota
    {
        int img,real;
        iota(int a,int b)
        {
            img =b;
            real = a;
        }
    }
class complex
{ public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the real and imaginary part");
        int r=sc.nextInt();
        int i=sc.nextInt();
        iota ob= new iota(r,i);
        System.out.println("Enter the real and imaginary part");
        r=sc.nextInt();
        i=sc.nextInt();
        iota ob1=new iota(r,i);
         sum(ob.real,ob1.real,ob.img,ob1.img);
    }
    static void sum(int a, int b,int c,int d)
    {
        System.out.println("Sum="+(a+b)+"+i"+(c+d));
    }
}
