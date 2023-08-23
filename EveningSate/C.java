class C{


    public C(){
        System.out.println("Hey i am constructor");
    }

    public void D(){
        System.out.println("Hey i am D method");

    }

    public static void main(String[] args){
        //C(); this not valid 

        // new keyword ?
        C rv1;
        rv1 = new C();
        //C rv = new C();
        //rv.D();
    }
}