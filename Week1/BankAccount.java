class BankAccount{
    private String name;
   private  int balance;
   BankAccount(String name , int balance){
    this.name =name;
    this.balance=balance;
   }
    
    void checkbalance(){
        System.out.println("Balance "+balance);
    }
    void deposit(int amount){
        balance+=amount;
       
        System.out.println("The new balance " + balance);
    }

    void withdraw (int amount){
        if(amount>balance){
            System.out.println("Insufficent amount");
        } else{
            balance-=amount;
            System.out.println("The new avaiable balance is "+ balance);
        }
    }
    public static void main(String args[]){
        // BankAccount acc = new BankAccount();
        // acc.name = "Om";
        // acc.balance=500;
        // acc.checkbalance();
        // acc.deposit(2000);
        // acc.checkbalance();
        // acc.withdraw(500);
        BankAccount account = new BankAccount("juju", 500);
        account.checkbalance();
        account.deposit(2000);
        account.withdraw(1000);
        account.checkbalance();
    }
}