class SavingsAccount extends BankAccount{
    SavingsAccount(String name, int balance){
        super(name,balance);
    }
    
    void addInterest(int intrestRate){
        int newbalance= getbalance()+getbalance()*intrestRate/100;
        System.out.println("The new balance after interest is "+ newbalance);
    }

}