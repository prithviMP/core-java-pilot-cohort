class MatchBox{
    public int length; 
    public int width;
    public int height;

    public MatchBox(int a){
        length = a;
        width = a;
        height = a;
    }
    // this is the best way to create constructor
    public MatchBox(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public MatchBox(){
        length = 10;
        width =20;
        height =30;
    }

    public void displayInfo(){
        System.out.println("Length is "+length);
        System.out.println("width is "+ width);
        System.out.println("height is "+ height);

    }

    public static void main(String[] args){
        //MatchBox sqMatchBox = new MatchBox(20);
        MatchBox recMatchBox = new  MatchBox(20,30,10); 
      
       // sqMatchBox.displayInfo();
        System.out.println("-------------------");
        recMatchBox.displayInfo();
    

    // NOTE:- if we create our own construtor complier will not add default constructor88         
    }
}