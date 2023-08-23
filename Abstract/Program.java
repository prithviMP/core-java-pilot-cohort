abstract class Run{
    public void hello(){
        System.out.println("hello");
    }
}

class Run1 extends Run{

}

class Test1{
    public static void main(String[] args){
        Run1 r = new Run1();
        r.hello();
    }
}