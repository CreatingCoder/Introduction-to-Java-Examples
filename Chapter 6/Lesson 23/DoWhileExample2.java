class DoWhileExample2 {

   public static void main(String[] args){
   /*This program demonstrates how a "do while" statement always executes
   at least once.*/
   
      int numOfChairs = 6;
      int numOfGuests = 6;
    
      do{
         System.out.println("We have " + numOfChairs + " chairs");
         numOfChairs++;
      }
      
      while(numOfChairs < numOfGuests);
          
      System.out.println("We have " + numOfChairs + " chairs!, perfect!");
      
   }
}
