class MessWallet {
    private double balance;

    public MessWallet(double balance) {
        if (balance < 0) {
            this.balance = 0;
            System.out.println("Warning: Negative opening balance. Balance set to 0.");
        } else {
            this.balance = balance;
        }
    }

    public void topUp(double amount) {
        if (amount <= 0) {
            System.out.println("Top-up amount must be greater than 0.");
        } else {
            balance = balance + amount;
            System.out.println("Top-up successful.");
        }
    }

    public void deduct(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance. Deduction not allowed.");
        } else {
            balance = balance - amount;
            System.out.println("Deduction successful.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        MessWallet wallet = new MessWallet(500);

        wallet.topUp(200);
        wallet.deduct(100);
        wallet.deduct(700);

        System.out.println("Current Balance: " + wallet.getBalance());
    }
}