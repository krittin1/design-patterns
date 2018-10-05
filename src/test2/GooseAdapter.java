package test2;

import test1.Goose;
import test1.Quackable;

public class GooseAdapter implements Quackable {

    Goose goose;
    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }
    public void quack() {
        goose.honk();
    }

}
