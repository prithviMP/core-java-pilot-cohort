class P{
    public  double d1 = 2.02;

}

class Q extends P{
    public  double d2 = 3.02;

}
class R extends Q{
    public  double d3 = 4.02;

}

class Test1{
    public static void main(String[] args){
        P p1 = new P();
        System.out.println(p1.d1);
        System.out.println("-------------------");
        Q q1 = new Q();
        System.out.println(q1.d2);
        System.out.println(q1.d1);
        System.out.println("-------------------");
        R r1 = new R();
        System.out.println(r1.d3);
        System.out.println(r1.d2);
        System.out.println(r1.d1);
      

    }
}