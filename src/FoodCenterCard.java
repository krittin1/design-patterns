public class FoodCenterCard {
    private double balance;

    public void topUp(double money){
        if(money < 0) throw new IllegalArgumentException("money must be positive");
        balance += money;
    }

    public void spend(double purchase){
        if (purchase > balance) throw new IllegalArgumentException("balance is insufficient");

        balance -= purchase;

    }
    public double getBalance() {
        return balance;
    }
}
