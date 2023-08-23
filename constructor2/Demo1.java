class Demo1{

    public Demo1(){
        System.out.println("Inside default constructor  ");
    }

    public Demo1(int a){
         System.out.println("Inside int constructor  ");
    }

     public Demo1(double a){
         System.out.println("Inside double  constructor  ");
    }

    
    public static void main(String[] args){
        Demo1 d1 = new Demo1();
        Demo1 d2 = new Demo1(100);
        Demo1 d3 = new Demo1(8.9);

        // this is called as constructor overloading 
        
    }
}