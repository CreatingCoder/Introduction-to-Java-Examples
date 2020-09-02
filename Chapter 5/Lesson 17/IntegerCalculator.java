import java.util.Scanner;

class IntegerCalculator {

   public static void main(String[] args){
   //Create a scanner
      Scanner scan = new Scanner(System.in);
   
   //Print out instructions, then scan the 1st number
      System.out.println("Input the first integer you want multiplied and press Enter");
      int userInput1 = scan.nextInt();
      
   //Print out the next instructions, then scan the 2nds number   
      System.out.println("Input the first integer you want multiplied and press Enter");
      int userInput2 = scan.nextInt();
      
   //Multiply the two user's number
      int product = userInput1 * userInput2;
   
   //Return the product of the two numbers
      System.out.println("The product is " + product);
      
   }
}
