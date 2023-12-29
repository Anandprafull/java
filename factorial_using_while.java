import java.util.Scanner;
class Main{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number: ");
  int num = sc.nextInt();
  int i=1,fact=1;
  while(i<=num){
    fact=fact*i;
    i++;
  }
  System.out.println("Factorial of a number"+fact);
  
  }
}
