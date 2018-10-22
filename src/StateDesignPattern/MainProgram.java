package StateDesignPattern;

import java.util.*;
public class MainProgram {
    public static void main(String[] args) {
        State ss = new State(45,"siam");
        State st2 = new State(50,"nana");


        List<State> sss = new ArrayList<State>();
        sss.add(ss);
        sss.add(st2);
       

        VendingMachine ticketingMachine = new VendingMachine(sss);

        ticketingMachine.ticketing();

        ticketingMachine.chooseStation("siam");

        ticketingMachine.insertingCoin(45);
        ticketingMachine.insertingCoin(50);
        ticketingMachine.chooseStation("nana");

        ticketingMachine.insertingCoin(50);
    }
}
