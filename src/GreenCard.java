public class GreenCard extends FoodCenterCard{

    @Override
    public void topUp(double money) {
        super.topUp(money);
        double addttion = ((int)money / 200) * 10;
        super.topUp(addttion);

    }
}
