package Session;

public class AccountDanger implements Runnable {
    private Account acct = new Account();

    public static void main (String [] args) {
        AccountDanger r = new AccountDanger(); // Target Runnable

        Thread one = new Thread(r);
        Thread two = new Thread(r);

        one.setName("Mayuresh");
        two.setName("Anoop");

        one.start();
        two.start();
    }

    @Override
    public void run() {
        for (int x = 0; x < 6; x++) {
            System.out.println(Thread.currentThread().getName() + " inside loop...");

            makeWithdrawal(10);

            if (acct.getBalance() < 0) {
                System.out.println("account is overdrawn!");
            }
        }
    }

    private synchronized void makeWithdrawal(int amt) {
        if (acct.getBalance() - amt >= 0) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw");

            try {
                Thread.sleep(1000);
            } catch(InterruptedException ex) {
                throw new RuntimeException(ex);
            }

            acct.withdraw(amt);

            System.out.println(Thread.currentThread().getName() + " completes the withdrawal, " + " Balance: " + acct.getBalance());
        } else {
            System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw, " + " Balance: " + acct.getBalance());
        }
    }
}

class Account {
    private int balance = 50;
    public int getBalance() {
        return balance;
    }
    public void withdraw(int amount) {
        balance = balance - amount;
    }
}





