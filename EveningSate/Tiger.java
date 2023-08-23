class Tiger{
    public String tName;
    public int tAge;
    public static String species;


    public Tiger(String name, int age){
        tName = name;
        tAge = age;
        species = "cat";
    }

    public void displayTigerInfo(){
        System.out.println("Tiger name is "+tName);
        System.out.println("Tiger age is "+tAge);
        System.out.println("Tiger species is "+species);
    }

    public static void main(String[] args){
        Tiger t1 = new Tiger("Tommy", 5);
        Tiger t2 = new Tiger("Chintu", 8);
        Tiger t3 = new Tiger("munni",3);

        t1.displayTigerInfo();
         t2.displayTigerInfo();
        t3.displayTigerInfo();

        // Issue is all tiger are having same name and age 
        // solution for this .. constructor with parameters/ arguments 
    }
}