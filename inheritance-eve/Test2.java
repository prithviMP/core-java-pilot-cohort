class J{
    public int a= 10;
}

class K extends J{
    public int b= 20;
}

class L extends J{
    public int c= 30;
}

class Test2{
    public static void main(String[] args){
        J j1 = new J();
        K k1 = new K();
        L l1 = new L();

        System.out.println(j1.a);
        System.out.println(k1.a);
        System.out.println(l1.a);

    }
}