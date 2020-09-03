class PrintExample {

   public static void main(String[] args){
      int count = 10;
             
      System.out.println("I am counting to " + count);         
      
      for(int i = 1; i<= count; i++){       
         
         if(i==10){
            System.out.print(i);
         }
         
         else{
            System.out.print(i + ", ");
         }
          
      } 
   }
}
