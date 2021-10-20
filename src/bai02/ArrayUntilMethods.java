package bai02;

import java.util.Arrays;

public class ArrayUntilMethods {
    public static void main(String[] args) {

        int[] unsortedArr = {1,9,7,3};
        //1. Sort an array
        int[] sortedArr = Arrays.stream(unsortedArr).sorted().toArray();
        //2: Find min, max
        int min = Arrays.stream(unsortedArr).min().getAsInt();
        int max = Arrays.stream(unsortedArr).max().getAsInt();


    }
}
