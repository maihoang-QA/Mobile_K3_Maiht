package bai02;

public class ForLoopExercise {
    //Input a number

    //Nhập 3

    //***
    //**
    //*
    public static void main(String[] args) {

        int inputNumber = 9;
        //--giảm dần con số nhập vào mỗi lần 1 đơn vị
        for (;inputNumber>0;inputNumber--){
            System.out.println(inputNumber);
            for (int starIndex = 1; starIndex <= inputNumber; starIndex++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
