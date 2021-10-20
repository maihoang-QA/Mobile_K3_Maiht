package bai01;

import java.util.Scanner;

public class VariableLearning {

    public static void main(String[] args) {
       int myIntNum;
       myIntNum = 18;
        System.out.println("My Variable: " +myIntNum);
        System.out.println("My Variable: " +myIntNum);
        //Dupplicate line: ctrl +D
        int a = 1;
        int b = 2;

        int sum = a + b;//Breakpoint
        //ko cần in ra nhưng vẫn bit giá trị của sum
        //sử dụng debug

        //Pre-fix, post-fix

        int c = ++a + b++;
        //pre-fix: a = 2 (++a)
        //c= a+ b =4
        //post-fix: b++ = 3 (vì b dc thực hiện sau phép cộng )

        boolean amIRight = false;
        amIRight = true;
        float myFloatNum = 3.0f;
        double myDoubleNum = 3.0;

        System.out.printf("My Variable: %d", myIntNum);
        //Khi in như này thì myIntNum sẽ thay vào vị trí của %d

        boolean isABiggerThanB = a > b;
        boolean revertedBoolean = !isABiggerThanB;

        int d = 4/2;//chia lấy phần nguyên 4/2=2
        int e = 4%2;//chia lấy phần dư e=0;

        //If else


    }
}