 abstract class Demo{
    abstract public void greet();
    abstract public void wish();
}


// inheriting from abstract class 
    // 1. you have overide abstract method 
    
class Demo1 extends Demo{
    public void greet(){
        System.out.println("I am overiding abstract method");
    }

    public void wish(){
        System.out.println("I am overiding abstract method wish");
    }

}
// 2. you also have to declase the class as abstract 
abstract class Demo2 extends Demo{
     public void wish(){
        System.out.println("I am overiding abstract method wish");
    }
}

abstract class Demo3 extends Demo2{
    public void greet(){
        System.out.println("I am overiding abstract method");
    }
}

class Test{
    public static void main(String args[]){
        Demo1 d1 = new Demo1(); // create object of abstract class 
        d1.greet();
        d1.wish();
    }
}