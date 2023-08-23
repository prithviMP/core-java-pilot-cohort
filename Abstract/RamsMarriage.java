class Father{
   final public void marry(){
        System.out.println("marry aishwarya");
    }
}

class Ram extends Father{
     public void marry(){
        System.out.println("marry katrina kaif");
    }
}

class RamsMarriage{
    public static void main(String args[]){
        Ram ram = new Ram();
        ram.marry();
    }
}