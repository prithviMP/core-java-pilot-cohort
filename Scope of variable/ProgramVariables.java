 // 4
 
class ProgramVariables{

    //1
    public static int a=20; 


    public static void main(String args[]){
            int num; // local variable // declare
            num = 10;
            move();
             System.out.println("Hello in main "+ a);

      
    }

    public static void move(){
        // drirectly accessing it 
        System.out.println("Hello in move "+ a);
        // 2. Using class name
        System.out.println("Hello using class name  move "+ ProgramVariables.a);
    }

    //2
    // Write global variable of all data type and print their default value
   
}