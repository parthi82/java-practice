
 /**
  * This program prints all the Three digit Amstrong numbers
  */


 public class ThreeDigitAmstrong {

    public static void main(String[] args) {

        int index = 1;
         
        for(int i = 100; i <= 999; i++) {

           if(isAmstrong(i)) {
              System.out.println(index + ". " + i);
              index++;
           }

        }


    }


    /**
     * The method checks if a value is a Amstrong Number
     *
     * @ param number integer to be checked
     * @ return true, if number is a Amstrong number, 
     *   false otherwise
     */


    public static boolean isAmstrong(int number) {

        int copyOfNumber = number;
        int sum = 0;

        while(copyOfNumber != 0) {

          int lastNumber = copyOfNumber % 10;
          sum += (lastNumber * lastNumber * lastNumber);
          copyOfNumber /= 10;

        }

        if(sum == number)
           return true;
       else 
       	   return false;

    }
 
 }