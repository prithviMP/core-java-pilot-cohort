class M{
    public double land = 25000.90;
}

class N extends M{
    public double newLand = 1800.90;
}

class O extends N{
    public double veryNewLand = 1400.90;
}

class Test1{
    public static void main(String[] args){
        M m1 = new M();
        N n1 = new N();
        O o1 = new O();

        System.out.println("M -- has land "+ m1.land);
        System.out.println("N -- has land "+ n1.land);
        System.out.println("O -- has land "+ o1.land);


    }
}