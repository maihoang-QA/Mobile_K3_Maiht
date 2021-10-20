package bai02;

public class ArrayType {
    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        myIntArray[0] = 1;
        myIntArray[1] = 2;
        myIntArray[2] = 3;
        myIntArray[3] = 4;
        myIntArray[4] = 5;

        int myCurrentArrLenght = myIntArray.length;
        if (myCurrentArrLenght != 0){
            for (int elementIndex = 0; elementIndex< myCurrentArrLenght; elementIndex++){
                System.out.println(myIntArray[elementIndex]);
            }
        }else{
            System.out.println("Empty array!");
        }


    }
}
