class Emp{

}

class Tiger{

}

class Monkey{


}

class Program{
    public static void main(String[] args){
        Emp e1;
        Tiger t1;
        Monkey m1;

        e1 = new Emp();
        t1 = new Tiger();
        m1 = new Monkey();

        Emp e2 = new Emp();
        Tiger t2 = new Monkey();
        Monkey m2 = new Tiger();

        System.out.println("In program class");
    }
}