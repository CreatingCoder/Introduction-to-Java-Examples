class DoWhileExample1 {

   public static void main(String[] args){
      int numOfChairs = 1;
      int numOfGuests = 6;
    
      do{
         System.out.println("We have " + numOfChairs + " chairs");
         numOfChairs++;
      }
      
      while(numOfChairs < numOfGuests);
          
      System.out.println("We have " + numOfChairs + " chairs!, perfect!");
      
   }
}
