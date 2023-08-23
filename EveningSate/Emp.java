class Emp{
    public int eId;
    public String eName;
    public double eSal;

    public void EmpInit(int id, String name, double sal){
        eId = id;
        eName = name;
        eSal = sal;
    }

    public void displayEmpInfo(){
        System.out.println("Emp id is : "+ eId);
        System.out.println("Emp name is : "+ eName);
        System.out.println("Emp Sal is : "+eSal);
    }

    public static void main(String[] args){
        Emp e1 = new Emp();
        Emp e2 = new Emp();
        Emp e3 = new Emp();

        e1.EmpInit(1, "deepak", 80000.90);
        e2.EmpInit(2, "fijula", 150000.80);
        

        e1.displayEmpInfo();
        e2.displayEmpInfo();
        e3.displayEmpInfo();

        // prone to human error 

        // constructor 
    }
}