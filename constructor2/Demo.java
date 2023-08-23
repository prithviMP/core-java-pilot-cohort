class Demo{

    public int num;

    // if the programmer doest add constructor.. compiler will add default constructor 
    /*
        public Demo(){

        }

        addded by compiler

    */

    public static void main(String[] args){
        Demo d1 = new Demo();
        System.out.println("object d1 num value is  "+d1.num);
    }
}