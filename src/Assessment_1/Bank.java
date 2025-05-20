package Assessment_1;

public class Bank {
    public static void main(String[] args){
        BankAccount acc = new BankAccount();
        acc.balance=1000;
        System.out.println("Current Balance: "+acc.balance);
        acc.deposit(500);
        acc.withdraw(400);
        acc.checkBalance();
    }
}

class BankAccount{
    int balance;

    void deposit(int amount){
        this.balance = this.balance+amount;
        System.out.println(amount+" Deposit..");
        System.out.println("Balance after Deposit: "+this.balance);
    }

    void withdraw(int amount){
        if(this.balance - amount >= 0){
            this.balance = this.balance - amount;
            System.out.println(amount+" Withdraw..");
            System.out.println("Balance after Withdraw: "+this.balance);
        }
        else{
            System.out.println("Insufficient Balance..");
        }
    }

    void checkBalance(){
        System.out.println("Check Balance: "+this.balance);
    }
}
