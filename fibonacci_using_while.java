import java.util.Scanner;
class Fibbonaci{
  public static void main(String args[]){
    int n,a=0,b=0,c=1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n: ");
    n=sc.nextInt();
    System.out.println("Fibonacci Series");
    int i=1;
    while(i <= n) {
      System.out.print(a+" ");
      a=b;
      b=c;
      c=a+b;
      i++;
    }
    }
    
}
