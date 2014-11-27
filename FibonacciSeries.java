 
  /*
   * This program prints a fibonacci series for a given number
   * fibonacci series starts wit 0, 1. the next numbers is
   * obtained by adding the previous two numbers. the number 
   * Xn is given by Xn = Xn-1 + Xn-2
   */

   import java.util.Scanner; 
   public class FibonacciSeries {
        
        public static void main(String[] args){

            // create instance to read the integer value from user 
            Scanner stdin = new Scanner(System.in);

            // get value from user
            System.out.println("Enter the value to find fibonacci series");
            // assign the value to variable range 
            int range = stdin.nextInt();

            // create an array to store values of the series and assign first two values as 0 and 1
            int[] feboSeries = new int [range];
            feboSeries[0] = 0;
            feboSeries[1] = 1;

            // compute the values for the fibonacci series
            for(int n = 2; n < range; n++){
               
               feboSeries[n] = feboSeries[n - 1] + feboSeries[n - 2];

            }

            // print the values stored in the array
            for(int i = 0; i < range; i++) {
               
               System.out.print(feboSeries[i] + " ");

            }
        }
   }