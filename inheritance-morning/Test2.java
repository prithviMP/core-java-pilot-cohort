

class N extends M{
    public  int j = 3;

}
class O extends M{
    public int k = 4;

}
class M{
    public  int i = 2;1

}

class Test2{
    public static void main(String[] args){
        M m1 = new M();
        N n1 = new N();
        O o1 = new O();
        System.out.println(n1.i);
        System.out.println(n1.j);
         System.out.println("-----------");
        System.out.println(o1.i);
        System.out.println(o1.k);
      

    }
}