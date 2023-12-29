import java.util.Scanner;
class ATM{
  public static void main(String args[])
  {Scanner sc=new Scanner(System.in);
  System.out.println("Enter 1 for withdrawing money.\nEnter 2 for depositing money.\nEnter 3 to check bank balance.\n");
  int n=sc.nextInt();
  int amt,money=10000;
  
  switch (n)
{ case 1:
    System.out.println("Enter amount to be withdrawn");
      amt=sc.nextInt();
    if(amt<=money && amt>0)
    {System.out.println("Withdrawing Money");
    money-=amt;
    System.out.println("Total Balance="+money);
    } else{
      System.out.println("Enter amount under 10,000");
        }
    break;
  case 2:
    System.out.println("Enter amount to be deposited");
    amt= sc.nextInt();
    money +=amt;
    System.out.println("Total Balance="+money);
    break;   
  case 3:
    System.out.println("Available Balance = "+money);
    break;    
  default:
    System.out.println("Invalid Input!");
    break;    
    }    
  }    
}
