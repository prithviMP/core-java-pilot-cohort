class Rectangle{
    public int length;
    public int width;

    public void RectInit(int len , int wid){
        length = len;
        width = wid;
    }

    public void area(){
        System.out.println(" area of rectanagle is "+ length*width);
    }

    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.RectInit(20, 30);
        r1.area();

         Rectangle r2 = new Rectangle();
         // to rectify above issue we will go for constructor 
         r2.area();
    
    }


    // break for 5minsback at 7:05 


}