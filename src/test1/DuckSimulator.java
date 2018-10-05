package test1;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }
    void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        System.out.println("\nDuck Simulator");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator: With Goose Adapter");
        simulate(gooseDuck);

        Quackable pigeonDuck = new PigeonAdapter(new Pigeon());
        System.out.println("\nDuck Simulator: With Pigeon Adapter");
        simulate(pigeonDuck);
        simulate(pigeonDuck);

    }
    void simulate(Quackable duck) {
        duck.quack();
    }



}
