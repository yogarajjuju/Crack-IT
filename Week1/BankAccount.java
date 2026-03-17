class BankAccount{
    String name;
    int balance;
    
    void checkbalance(){
        System.out.println("Balance "+balance);
    }
    void deposit(int amount){
        balance+=amount;
        System.out.println("The new ba")
    }
    public static void main(String args[]){
        BankAccount acc = new BankAccount();
        acc.name = "Om";
        acc.balance=500;
        acc.checkbalance();
    }
}