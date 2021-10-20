package bai03;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhiteLoop {
    public static void main(String[] args) {
        final int[] myIntArr = {0,1,2,3,4,5,6,7,8,9};
        int randomNum = myIntArr[new SecureRandom().nextInt(myIntArr.length)];
        final int MAX_GUESSING_TIME = 3;
        int userGuestTime =0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Please input a number:");
            int inputNum = scanner.nextInt();
            if (inputNum==randomNum){
                System.out.println("hooray");
                break;
            }
            userGuestTime++;
        }while (userGuestTime<MAX_GUESSING_TIME);
        System.out.println("See you next time!");
    }
}
