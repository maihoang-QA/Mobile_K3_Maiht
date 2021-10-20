package bai02;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        //<18: Khong ban ruou bia
        //18-55: OK
        //>55: ban 2 chai beer

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your age");
        int userAge = scanner.nextInt();


        if (userAge<18){
            System.out.println("Khong ban bia ruou!");

        }else if (userAge>=18 && userAge<=55){
            System.out.println("OK!");

        }else {
            System.out.println("Ban hai chai");

        }

        int age18 =18;
        int age29 =29;
        int age57 =57;


    }
}