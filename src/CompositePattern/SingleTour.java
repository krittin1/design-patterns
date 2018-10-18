package CompositePattern;

public class SingleTour implements Tour {
    private String name;
    private double price;
    private int allSeats;
    private int reservedSeats;

    public SingleTour(String name, double price, int allSeats, int reservedSeats) {
        this.name = name;
        this.price = price;
        this.allSeats = allSeats;
        this.reservedSeats = reservedSeats;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public int getAllSeats() {
        return allSeats;
    }

    public int getReservedSeats() {
        return reservedSeats;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public void setAllSeats(int allSeats) {
        this.allSeats = allSeats;
    }

    public void setReservedSeats(int reservedSeats) {
        if (reservedSeats <= (allSeats-this.reservedSeats)) {

            this.reservedSeats = reservedSeats;

        }
    }

    @Override
    public String toString() {
        return "name :"+name +" ,price :"+price+" ,available seats :"+getAvailableSeats();
    }

    @Override
    public int getAvailableSeats() {

        if(allSeats - reservedSeats < 0) {
            return  0;
        }

        return allSeats - reservedSeats ;

    }
}
