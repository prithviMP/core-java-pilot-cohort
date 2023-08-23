class BoyFriend{
    public void movie(){
        System.out.println("-----Openheimer----");
    }
}

class GirlFriend extends BoyFriend{
    public void movie(){
        System.out.println("-----Barbie----");
    }
}

class Program{
    public static void main(String[] args){
        GirlFriend gf = new GirlFriend();
        gf.movie();
    }
}