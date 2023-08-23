class Demo2{
    
    public int i;
    public double j;

    public Demo2(){
        System.out.println("Inside default constructor  ");
    }

    public Demo2(int a){
        i =  a;
         System.out.println("Inside int constructor  ");
    }

     public Demo2(double a){
        j = a;
         System.out.println("Inside double  constructor  ");
    }

    public Demo2(int a, double b){
        
        i = a;
        j = b;
         System.out.println("Inside int and double  constructor  ");
    }

    
    public static void main(String[] args){
        Demo2 d1 = new Demo2();
        Demo2 d2 = new Demo2(100);
        Demo2 d3 = new Demo2(8.9);
        Demo2 d4 = new Demo2(2, 3.6);
    
        // code repitation --> ?? --> by creating a non static method   (H.w)  
        System.out.println("d1----------------------");
        System.out.println(d1.i);
        System.out.println(d1.j);
        System.out.println("d2----------------------");
        System.out.println(d2.i);
        System.out.println(d2.j);
        System.out.println("d3----------------------");
        System.out.println(d3.i);
        System.out.println(d3.j);
        System.out.println("d4----------------------");
        System.out.println(d4.i);
        System.out.println(d4.j);
        System.out.println("----------------------");

        // purpose of construtor overloading 
        // By developing multiple constructor--> 
        //we are provinding flrxibilty to carete object in multiple ways 
        
    }
}