class Run{
    public int k= 35; // non static var
    public int l = 45;// non static var
}

class Run1 extends Run{
    public int m = 20;

    public void show(){ // nsm -> directly nsv
        System.out.println("k = "+ k); // k
        System.out.println("l = "+ l);// l
        System.out.println("m = "+ m); // m
    }
}

class Test{
    public static void main(String[] args){
        Run1 r1 = new Run1();   // r1 -> k, l, m , show()
        r1.show();
    }
}

// in sub class non static method access sub class mems and also super class members 