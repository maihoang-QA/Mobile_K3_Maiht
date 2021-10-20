package bai02;

import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {

        //1: giai nhat
        //2: giai nhi
        //3: giai ba
        //other: chuc ban may man lan sau

        int currentNum = 1;

        switch (currentNum){
            case 1:
                System.out.println("Giai nhat");
                break;
            case 2:
                System.out.println("Giai nhi");
                break;
            case 3:
                System.out.println("Giai ba");
                break;
            default:
                System.out.println("Chuc ban may man lan sau");
        }

        System.out.println("Out of Switch Statement!");




    }
}
