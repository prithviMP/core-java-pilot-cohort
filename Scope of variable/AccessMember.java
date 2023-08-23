 
class AccessMember{

    public static int st_num = 30;
    public int nst_num = 420;
    public static void main(String args[]){
           System.out.println(st_num);
           // to access non static method inside a static method 
           // create a refrence variable 
           // using refrence variable u will access non static members of class

            int st_num = 840; 
            AccessMember rv = new AccessMember();
            rv.jump();
            System.out.println("in man -- nst -->"+rv.nst_num);
            System.out.println("ss"+ AccessMember.st_num);
           
    }

    public void jump(){
        System.out.println(nst_num);

    }


    
   
}