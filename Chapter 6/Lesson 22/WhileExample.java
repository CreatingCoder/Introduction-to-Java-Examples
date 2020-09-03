class WhileExample {

   public static void main(String[] args){
      int numOfChairs = 1;
      int numOfGuests = 6;
    
      while(numOfChairs < numOfGuests){
         System.out.println("We only have " + numOfChairs + " chairs, let me grab another");
         numOfChairs++;
      }
   
      if (numOfChairs == numOfGuests){
         System.out.println("We finally have " + numOfChairs + " chairs!");
      }
   
   }
}
