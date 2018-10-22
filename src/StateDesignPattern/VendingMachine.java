package StateDesignPattern;

import java.util.List;
import java.util.ArrayList;


public class VendingMachine {
    List<State> states =new ArrayList<>() ;
    State s ;
    final static int PAID = 2;
    final static int READY = 1;
    final static int END = 0;
    int state = END;

    double money;

    public VendingMachine(List<State> stations) {
        this.states = stations;
        state = END;
        money = 0;
    }

    public double getMoney() {
        return money;
    }
    public void chooseStation(String station){
        if (state == END){
            System.out.println("Error : Can't choose station");
        }
        else if(state == READY){
            state = PAID;
            for (State i :states) {
                if(i.getName().equals(station)){
                    s = i;
                    break;
                }
            }
            System.out.println("Station :" +
                    " "+s.getName() + " Price : "+s.getPrice());
        }
        else if(state == PAID){
            System.out.println("Error");
        }
    }


    public void ticketing(){
        if (state == END){
            state = READY;
            System.out.println("Please choose station");
        }
        else if(state == READY){
            System.out.println("Error");
        }
        else if(state == PAID){
            System.out.println("Error");
        }

    }

    public void insertingCoin(double money){
        if (state == END){
            System.out.println("Error");
        }
        else if(state == READY){
            System.out.println("Error");
        }
        else if(state == PAID){
            this.money = this.money + money;
            if(this.money >= s.getPrice()){
                state = END;
                if(this.money > s.getPrice()){
                    System.out.println("You receive  "+ (this.money-s.getPrice())+" baht.");
                }
                System.out.println("Thank you .");
                this.money= 0;
            }
            else{
                System.out.println("Error"+(s.getPrice()-this.money));
            }
        }
    }


}
