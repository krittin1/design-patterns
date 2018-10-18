package CompositePattern;

import java.util.ArrayList;

import java.util.List;
public class PackageTour implements Tour {
    private String packageName;
    private List<Tour> tours = new ArrayList<Tour>();
     double sum = 0;

    public PackageTour(String packageName, List<Tour> tours) {
        this.packageName = packageName;
        this.tours = tours;
    }

    @Override
    public String getName() {
        return packageName;
    }

    @Override
    public double getPrice() {
        for (Tour i : tours)
            sum = sum + i.getPrice();
        return sum*0.9;
    }

    @Override
    public String toString() {
        return "name :"+packageName +", price :"+getPrice() +", available seats :"+ getAvailableSeats();
    }

    @Override
    public int getAvailableSeats() {
        int availableSeats = Integer.MAX_VALUE;
        for (Tour i : tours){
            if(availableSeats > i.getAvailableSeats() ) {

                availableSeats = i.getAvailableSeats();

            }

        }

        return availableSeats;

    }
}
