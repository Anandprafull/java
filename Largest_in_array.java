import java.util.Scanner;
class Largest{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of the Array");
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      System.out.println("Enter the element at the array position "+(i+1));
      a[i]=sc.nextInt();
    }
    int l=a[0];
    for(int i=0;i<n;i++){
      if(a[i]>l){
        l=a[i];
      }}
      System.out.println("Largestelement is "+l);
    }
  }
  
