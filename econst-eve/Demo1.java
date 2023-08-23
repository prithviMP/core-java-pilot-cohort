class Demo1{

    public int a;
    public double b;

    public Demo1(){
        System.out.println("I am default constructor");
    }

    public Demo1(int a1){
        a = a1;
        System.out.println("I am int constructor");
    }

    public Demo1(double b1){
        b = b1;
        System.out.println("I am double constructor");
    }

    public Demo1(int a1, double b1){
        a = a1;
        b = b1;
        System.out.println("I am int and double constructor");
    }

    public Demo1(double a1, int b1){
        a = b1;
        b = a1;
        System.out.println("I am int and double ulta constructor");
    }

    public static void main(String[] args){
        Demo1 d1 = new Demo1();
        Demo1 d2 = new Demo1(2);
        Demo1 d3 = new Demo1(3.3);
        Demo1 d4 = new Demo1(3.3,2);
        Demo1 d5 = new Demo1(2,9.9);
    }

    // construtor overloading - creating multiple construtor with different arguments.

}