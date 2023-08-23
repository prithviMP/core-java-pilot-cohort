class A{
    public int money = 700;
}

class B extends A{
    public int pocketMoney = 6;
}

class Test{
    public static void main(String[] args){
        A a1 = new A();
        System.out.println(a1.money);
         System.out.println("=-------------------=");
        B b1 = new B();
        System.out.println(b1.pocketMoney);
        System.out.println(b1.money);

    }
}