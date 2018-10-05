public class Main {
    public static void main(String[] args) {
        GreenCard green1 = new GreenCard();
        BludCard   blue = new BludCard();
        green1.topUp(100);
        System.out.println(green1.getBalance());
        green1.topUp(100);
        System.out.println(green1.getBalance());
       try {
           green1.topUp(-100);
           System.out.println(green1.getBalance());
       }catch (IllegalArgumentException e){
           System.out.println(e.getMessage());
       }

        blue.topUp(100);
        System.out.println("Balance: "+ blue.getBalance());
        System.out.println("Point: "+ blue.getPoint());
        blue.spend(50);
        System.out.println("Balance: "+ blue.getBalance());
        System.out.println("Point: "+ blue.getPoint());
        blue.topUp(400);
        System.out.println("Balance: "+ blue.getBalance());
        System.out.println("Point: "+ blue.getPoint());
        //up cast
        FoodCenterCard card = new BludCard();
        card.topUp(100);
        card.spend(100);
        System.out.println("-----------------------------");
        System.out.println("Balance: "+card.getBalance());
        //down cast
        System.out.println("Point: "+ ((BludCard)card).getPoint());


    }
}
