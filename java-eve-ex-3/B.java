class A{
    public static double d1 = 2.2;
    public double d2 = 9.8;
}

class B{
    public static void main(String[] args){
        System.out.println(A.d1);
        // non static variable - create a ref var

        A rv = new A();
        System.out.println(rv.d2);

    }
}