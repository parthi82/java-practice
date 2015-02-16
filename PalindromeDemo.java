
  /** 
   * This program checks if a number is a palindrome
   * palindrome is a number for which the reverse of
   * the number is the number itself. for example: 121
   */

   import java.util.Scanner;
   public class PalindromeDemo {

      public static void main(String[] args) {

          int number;
          int copyOfNumber;
          int reverseOfNumber = 0;
          int lastDigitOfNumber;

          Scanner stdin = new Scanner(System.in);

          // get input from user
          System.out.println("Enter a number to check if its a palindrome : ");
          number = stdin.nextInt();
          
          // make a copy of number to compute its reverse 
          copyOfNumber = number;

          // finding reverse of the number
          while(copyOfNumber > 0) {
             
             // find last digit by finding the quotient when dividing by 10
             lastDigitOfNumber = copyOfNumber % 10;
             // form int by ordering digit from bacwards
             reverseOfNumber = ( reverseOfNumber * 10 ) + lastDigitOfNumber;
             // discard last digit by dividing by ten and ignoring decimel part 
             copyOfNumber /= 10; 

          }

          if(number == reverseOfNumber) 
             System.out.println(number + " is a palindrome ! ");
          else 
             System.out.println( number + " is not a palindrome. ");
      }

   }
