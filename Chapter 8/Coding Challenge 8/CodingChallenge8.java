public class CodingChallenge8 {

   static void makeCoffee(boolean wantsCoffee){
   /*If we put a boolean value within the parenthesis of an if statement
   Java assumes that we only want that if-statement to execute when true */
      if(wantsCoffee){
         System.out.println("Your coffee is brewing");
      }
   }

   public static void main(String[] args){
      makeCoffee(true);   
   }
}
