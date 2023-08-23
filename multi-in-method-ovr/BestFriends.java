class Friend{
    public void jump(){
        System.out.println("I jumped from balcony");
    }
}

class Friend1 extends Friend{
    public void jump(){
        System.out.println("I jumped from terrace ");
    }
}

class Friend2 extends Friend1{
    public void jump(){
        System.out.println("I jumped from tower ");
    }
}

class Friend3 extends Friend2{
    public void jump(){
        System.out.println("I jumped from Areoplane  ");
    }
}
 
class BestFriends{
    public static void main(String[] args){
        Friend f = new Friend();
        Friend f1 = new Friend1();
        Friend f2 = new Friend2();
        Friend f3 = new Friend3();
        
        
        f.jump();
        f1.jump();
        f2.jump();
        f3.jump();

    }
}

