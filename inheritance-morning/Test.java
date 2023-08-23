class A{
    public static int k = 420;
    public int i=200;
}

class B extends A{
    public int j= 300;
    

}

class Test{
    public static void main(String[] args){
        A a1 = new A();
        System.out.println("i = "+ a1.i);
        B b1 = new B();
        System.out.println("j = "+ b1.j);
        System.out.println("i = "+ b1.i);
        System.out.println("k = "+ b1.k);
        System.out.println("k = "+ B.k);

    }
}