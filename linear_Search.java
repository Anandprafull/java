import java.util.Scanner;
class LinearSearch{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a[]= new int[100];
    for(int i=0;i<100;i++){
        a[i]=i+1;}
        
        System.out.println("Enter a number to be searched");
        int n=sc.nextInt();
        int c=-1;
    for(int i=0;i<n;i++)
    { if(a[i]==n)
        {c=i+1;
        break;
        }
    }
    if(c==-1){
        System.out.println("Element not found");}
    else{
    System.out.println("Element "+n+" found at position "+c);
    }
    }
}
