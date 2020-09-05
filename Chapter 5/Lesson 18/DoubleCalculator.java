import java.util.Scanner;

class DoubleCalculator {

   public static void main(String[] args){
   //Create a scanner
      Scanner scan = new Scanner(System.in);
   
   //Print out instructions, then scan the 1st number
      System.out.println("Input the first double you want multiplied and press Enter");
      double userInput1 = scan.nextDouble();
      
   //Print out the next instructions, then scan the 2nd number   
      System.out.println("Input the 2nd double you want multiplied and press Enter");
      double userInput2 = scan.nextDouble();
      
   //Multiply the two user's number
      double product = userInput1 * userInput2;
   
   //Return the product of the two numbers
      System.out.println("The product is " + product);
      
   }
}
