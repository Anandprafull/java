import java.util.Scanner;
class sumOfMatrices{
  public static void main(String args[])
    { Scanner sc=new Scanner (System.in);
      System.out.println("Enter number of rows and columns");
      int r=sc.nextInt();
      int c=sc.nextInt();
      int a[][]=new int [r][c];
      int b[][]=new int [r][c];
      
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
          System.out.println("Enter elements at index"+i+" "+j+" for matrix a and b resp");
          a[i][j]=sc.nextInt();
          b[i][j]=sc.nextInt();
          
        }
      }
      int s[][] = new int[r][c];
      for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
              s[i][j]=a[i][j]+b[i][j];
          }
      }
      System.out.println("Added matrix is ");
      for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
              System.out.println(s[i][j]+" ");}
              System.out.println();}
              
          
    
      
    }
  }
