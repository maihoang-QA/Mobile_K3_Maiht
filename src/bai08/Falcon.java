package bai08;

public class Falcon extends Animal {
    @Override
    protected boolean flyable() {
        return true;
    }

    @Override
    public int getSpeed() {
        return 0;
    }
}
