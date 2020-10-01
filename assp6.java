
import java.util.Scanner;
class assp7
{
 public static void main(String[] args)
 {
  int p,i,j;
  
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of rows:");
  p=sc.nextInt();
    

  for(i=p; i>=1; i--)
  {
   for(j=p; j>=1; j--)
    {
      if(i>=j)
      {
       System.out.print(" "+i);
      }

       else

     {
     System.out.print(" ");
    } 
   }  
 
    
   }
   System.out.println();
  }
  
 }
