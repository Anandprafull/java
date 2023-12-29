import java.util.Scanner;
class Pal{
  public static void main(String args[]){
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter a number");
   int n =sc.nextInt();
   
   int c=n,d=0;
   while(c>0){
     int t=c%10;
     d=d*10+t;
     c=c/10;
   }
   if(n==d){
     System.out.println(n+" is a palindrome number");
   }else
     System.out.println(n+" is not a palindrome number");
   }
    
    
}
