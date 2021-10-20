package bai08;

public abstract class Animal {
    //hàm xử lý đưa ra bên ngoài
    protected void speed(){
        speed();
        flyable();
    }

    protected abstract boolean flyable();

    public abstract int getSpeed();

}
