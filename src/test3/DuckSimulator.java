package test3;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory duckCountingFactory = new CountingDuckFactory();
        AbstractDuckFactory duckEchoFactory = new EchoDuckFactory();
        System.out.println("______________Factory_______________");
        simulator.simulate(duckFactory);
        System.out.println("______________Counting______________");
        simulator.simulate(duckCountingFactory);
        System.out.println("_______________Echo_________________");
        simulator.simulate(duckEchoFactory);

    }
    void simulate( AbstractDuckFactory duckFactory ) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeonDuck = new PigeonAdapter(new Pigeon());
        System.out.println("\nDuck Simulator: With Factory");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(rubberDuck);
        simulate(duckCall);
        simulate(gooseDuck);
        simulate(pigeonDuck);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times" + "\n");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
