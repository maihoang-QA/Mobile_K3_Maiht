package bai06;

import java.security.SecureRandom;

public class Horse extends Animal{
    public Horse() {
        //super: gọi contructor của cha
        super(new SecureRandom().nextInt(75));
    }


}
