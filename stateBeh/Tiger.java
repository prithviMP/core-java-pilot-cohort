class Tiger{
    public String tName;
    public int tAge;

    public Tiger(String name, int age){
        tName= name;
        tAge= age;
    }

    public static void main(String[] args){
        Tiger t1 = new Tiger("Sallu", 40);
        System.out.println(t1.tName);
        System.out.println(t1.tAge);
        Tiger t2 = new Tiger("Raja",6);
        System.out.println(t2.tName);
        System.out.println(t2.tAge);

        // we will use constructor with arguments 

        // modify rectangle , employee using constructor 
    }
}