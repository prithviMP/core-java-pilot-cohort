class RBI{
    public void homeLoanInterestRate(){
        System.out.println("Interst rate is 6.5");
    }
}

class SBI extends RBI{
     public void homeLoanInterestRate(){
        System.out.println("Interst rate of sbi is 7.5");
    }

}

class Canara extends RBI{
     public void homeLoanInterestRate(){
        System.out.println("Interst rate canara is 8.5");
    }

}

class BOB extends RBI{
     public void homeLoanInterestRate(){
        System.out.println("Interst rate hdfc is 9.5");
    }

}

class Hdfc extends RBI{

}

class Bank{

    public static void main(String[] args){
        RBI rbi = new RBI();
        SBI sbi = new SBI();
       Canara canara = new Canara();
       BOB bob = new BOB();
       Hdfc hdfc = new Hdfc();
       rbi.homeLoanInterestRate();
       sbi.homeLoanInterestRate();
       canara.homeLoanInterestRate();
       bob.homeLoanInterestRate();
       hdfc.homeLoanInterestRate();
    }
}

// 