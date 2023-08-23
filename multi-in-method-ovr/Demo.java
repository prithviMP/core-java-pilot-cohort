class Demo{
    public void wish(){ // method signature
        System.out.println("Hi-----");
        // method implementation
    }
}

class Demo1 extends Demo{
    public void wish(){  // method signature
        System.out.println("Byeeeee-----");
                // method implementation


    }
}

class Test1{
    public static void main(String[] args){
        Demo d1 = new Demo();
        d1.wish();

        Demo1 d2 = new Demo1(); // wish(parent ) -- // method overriding
        d2.wish();
    }
}