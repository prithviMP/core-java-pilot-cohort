class Run7{

    public static int p = 33;
    public int q = 44;
    public static void main(String[] args){
        System.out.println("In main starts");

        System.out.println(p);
        Run7 rv = new Run7();
        System.out.println(rv.q);
        // below is it valid ?? this is valid 
        System.out.println(rv.p);



    }
}