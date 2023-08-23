class Demo{

    public int num;

    // no constructor 
    // compiler will add it for us -- default constructor 

    public static void main(String[] args){
        Demo d1 = new Demo();
        // creating an object 

        System.out.println(d1.num);
    }

    // no need to write default construtor -- compiler will add it for us
}