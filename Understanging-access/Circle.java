class Circle{
     public static double pi= 3.14;

    public static void main(String[] args){
        System.out.println("main starts");
        area(6);
        circumfurance(4);
        pi = 6.6; // cannot re-intialise the value ;

    }
    public static void area(int r){
        double area = pi*r*r;
        System.out.println("area is "+ area);
       
    }

    public static void circumfurance(int r){
        double c = 2*pi*r;

        System.out.println("circumfurance is "+ c);

    }

}