public class BludCard extends  FoodCenterCard{
    private  int point;
    @Override
    public void topUp(double money) {
        super.topUp(money);
        point += ((int) (money / 200)) * 10;

    }
    @Override
    public void spend(double purchase) {
        super.spend(purchase);
        point += ((int) (purchase / 50)) * 2;
    }

    public void usePoint(int point) throws IllegalAccessException {
        if (point > this.point)
            throw new IllegalArgumentException("point is insufficient");
        this.point -= point;
    }


    public double getPoint() {
        return point;
    }

}
