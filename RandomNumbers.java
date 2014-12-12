 
  import java.util.Random;
  import java.util.Scanner;
  public class RandomNumbers {

      public static void main(String[] args) {

      	 int count = 0;

         Random r = new Random();
         int x = 1 + r.nextInt(10);

         System.out.println("Enter a number : ");
         Scanner stdin = new Scanner(System.in);
         int y = stdin.nextInt();

         if(x == y)
           System.out.println("The number is same as the random number generated , Surprising ! ");
         else 
         	System.out.println("The number wasn't same as the random number generated. ");

         System.out.println("\n");

        for(;;) {

         int a = 1 + r.nextInt(10);
         int b = 1 + r.nextInt(10);
         count++;

         if(count == 10)
           System.out.println("\n");

         System.out.println( count + "." + " a : " + a + ", b : " + b);
         

         if(a == b) {
           System.out.println("\n");
           System.out.println(" The number is same as the random number generated , Surprising ! ");
           break;
         }


        }

       System.out.println(" It took " + count + " turns");
      
      }
  
  }