// w a p to create square matchbox and rectangular match box 
class MatchBox{
    public int length;
    public int width; 
    public int height;

    public MatchBox( int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;

    }

     public MatchBox( int dim){
        this.length = dim;
        this.width = dim;
        this.height = dim;
    }

    public void displayInfo(){
        System.out.println("len = "+ length);
         System.out.println("wid = "+ width);
          System.out.println("height = "+ height);
    }

    public static void main(String[] args ){
        MatchBox rect = new MatchBox(20,30,10);
        MatchBox sq = new MatchBox(20);

        // default constructor -- ???
        // compiler will not add default construtor
        // if we need deafault construtor we need add it explicitly 
        MatchBox defaultMatchBox = new MatchBox();
        rect.displayInfo();
        sq.displayInfo();
        defaultMatchBox.displayInfo();
    }

}