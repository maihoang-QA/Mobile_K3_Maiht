package bai08;

public class Horse extends Animal {
    @Override
    protected boolean flyable() {
        return false;
    }

    @Override
    public int getSpeed() {
        return 0;
    }
}
