class CodingChallenge6 {

   public static void main(String[] args){
      int guessAge = 0;
      int userAge = 6;
    
      while(guessAge != userAge){
         System.out.println("You aren't " + guessAge);
         guessAge++;
      }
             
      System.out.println("You must be " + guessAge + " years old!");
      
   }
}
