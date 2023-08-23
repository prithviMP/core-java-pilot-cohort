class A{
    public static double d1 = 2.6;
    public double d2 = 7.9;
}

class B{
    public static void main(String[] args){
        System.out.println(A.d1);

        A rv = new A();
        System.out.println(rv.d2);

    }
}