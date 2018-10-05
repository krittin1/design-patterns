public class FoodCenterCardReader {
    private double price;

    public void setPrice(double price){
        this.price = price;
    }

    public  void read(BludCard card){
        card.spend(price);
        System.out.println("Balance: "+card.getBalance());
        price=0;
    }
    public void read(){

    }

}
