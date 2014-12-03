
  /**
   * This program is revised version of AmstrongNumber program
   * This program can be used to check numbers with any number
   * of digits
   */
   
   import java.util.Scanner;
   public class AmstrongNumber {

      public static void main(String[] args) {
          
          double input;
          int length;
          double copy;
          double output = 0.0;
          double modulus;
          

          Scanner stdin = new Scanner(System.in);
          System.out.print(" Enter a number : ");
          input = stdin.nextInt();
          

          // find number of digits in the input
          length = (int)(Math.log10(input)) + 1;
          System.out.println();
          System.out.println(" no. of digits in the number is : " + length);
          System.out.println();
          copy = input;

          for(int n = 0; n < length; n++ ) {
            modulus = copy % 10; // find the last digit of the number
            copy = (int) copy / 10; // discarding the last digit
            output = output + Math.pow(modulus, (double)length);
          }

          if((int)input == (int)output) 
             System.out.printf(" %d is a Amstrong number ", (int)input);
          else 
          	 System.out.printf(" %d is not a Amstrong number ", (int)input);

      }
   

   }