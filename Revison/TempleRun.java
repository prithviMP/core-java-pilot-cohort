
 
class TempleRun{
    public static void main(String args[]){
            System.out.println("I main method starts");
             move();
             System.out.println("I main method ends");
    }
    // inside class and otside main method 
    public static void move(){   
         System.out.println("I am moving");
         jump();

        System.out.println(" move  done");

    }

    public static void jump(){
        
         System.out.println("I am jumping ");

         slide();

          System.out.println(" jumping done");
    }

    public static void slide(){
        
         System.out.println("I am sliding ");

        System.out.println(" sliding  done");

    }

    
   

   // Observations 

    /* 
        1. method can be defined within class and outside main
        2. we need to call to use method
        3. methodname(); -> call method
        4. inside another method
        5. exectution always starts with main method 
        6. by default main method is automatically clled 
        7. we can create multiple methods
    
    
     */

     
}