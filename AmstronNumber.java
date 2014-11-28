 

  /**
   * This program checks wether a number is a amstrong number
   * or not. Amstrong are numbers for which the sum of each 
   * digit powered by total number of digits gives the original 
   * number example : 153 = 1^3 + 5^3 + 3^3
   */
 
   import java.util.Scanner;
   public class AmstrongNumber {

       public static void main(String[] args) {

           Scanner stdin = new Scanner(Sysstem.in); 
           int input, copyOfInput;
           int lastDigit;
           int output = 0;
           System.out.println("Enter a number");
           input = stdin.nextInt();

           while(input != 0) {

              lastDigit = input % 10;
              output = output + (lastDigit * lastDigit * lastDigit);
              input = input / 10;
           }

           if ( input == copyOfInput) {
             
              System.out.println("The number is a Amstrong");

           } else {

              System.out.println("The number is not a Amstrong number");

           }

       }


   }