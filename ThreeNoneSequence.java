

  /** 
   * This program prints 3N+1 sequence starting from the 
   * positive integer from the user. The number is divided
   * by two if even or multipled by three and one is
   * added to the product and ends when the result is one
   */

    public class ThreeNoneSequence {

       private static void ThreeNOne(long input) {

          while(input > 1) {

            if(input % 2 == 0) 
              input /= 2;
            else
              input = 3 * input + 1;
            
            System.out.println(input);


          }

       }   
       
       public static void main(String[] args) {

          long input = Long.parseLong(args[0]);


          if(input <= 0) 
            System.out.println(" The number should be a positive integer !, Sorry can't run the program. ");
          else   
            ThreeNOne(input);

       }

       
    }