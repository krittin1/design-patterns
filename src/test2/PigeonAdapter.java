package test2;

import test1.Pigeon;
import test1.Quackable;

public class PigeonAdapter implements Quackable {

    Pigeon pigeon;

    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }
    @Override
    public void quack() {
        pigeon.coo();

    }
}
