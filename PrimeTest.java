  
  import java.util.Scanner;
  public class PrimeTest {

      private static boolean isPrime(long num) {

           for(long i = 2; i < num; i++) {

               if( num % i == 0) {
               	   
               	   return false;
               }	   

            }

           return true;
        }


      public static void main(String[] args) {
          
          Scanner stdin = new Scanner(System.in);
          System.out.print("Enter a number : ");
          long number = stdin.nextLong();

          if(isPrime(number) == true) 
          	 System.out.println(number + " is prime number. ");
          else
             System.out.println(number + " is not a prime number. ");	

         }
    }
  