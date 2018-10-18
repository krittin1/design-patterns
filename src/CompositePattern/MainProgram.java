package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class MainProgram {
    public static void main(String[] args) {
        SingleTour t1 = new SingleTour("Hawii",35000,50,0);
        SingleTour t2 = new SingleTour("Seattle",50000,50,0);
        SingleTour t3 = new SingleTour("Dubai",50000,50,0);
        SingleTour t4 = new SingleTour("Bangkok",25000,30,0);
        List<Tour> tour = new ArrayList<Tour>();
        tour.add(t1);
        tour.add(t4);
        System.out.println(t3.toString());

        PackageTour packageTour = new PackageTour("China",tour);
        t2.setReservedSeats(50);
        t2.setReservedSeats(50);
        System.out.println(packageTour.toString());
    }
}
