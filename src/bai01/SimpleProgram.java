package bai01;

import java.util.Scanner;

public class SimpleProgram {
    public static void main(String[] args) {
        //cho user nhập từ bàn phím
        //System.in: lắng nghe từ bàn phím của user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");

        int inputNumber = scanner.nextInt();

        boolean isEvenNumber = (inputNumber % 2 == 0);
        //1 dấu = là gán
        //2 dấu = là so sánh
        if(isEvenNumber){
            System.out.printf("The number %d is a even number!\n", inputNumber );

        }else {
            System.out.printf("The number %d is a odd number!\n", inputNumber);
            //move xuống là ctrl + shift +mũi tên xuống
        }
            System.out.printf("See you next time!");
        }

    }
