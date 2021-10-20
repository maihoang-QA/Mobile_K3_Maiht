package bai06;

import java.util.Arrays;
import java.util.List;

public class RacingController {

    //Controller
    //Đối tượng mang tính chất trừu tượng hoá
    public static Animal getMaxSpeedAnimal(List<Animal> animals){
        Animal winner = null;

        for (Animal CurrentAnimal : animals) {

            System.out.println("Animal is:" + CurrentAnimal.getClass().getSimpleName());
            System.out.println("Animal's speed:" +CurrentAnimal.getSpeed());
            if(winner == null)
                winner = CurrentAnimal;
            else{
                if (winner.getSpeed() < CurrentAnimal.getSpeed()){
                    winner = CurrentAnimal;
                }
            }
        }


        return winner;
    }

    public static void main(String[] args) {
        Animal tiger = new Tiger();
        Animal horse = new Horse();
        Animal dog = new Dog();


        Animal winner = RacingController.getMaxSpeedAnimal(Arrays.asList(tiger, horse, dog));
        System.out.println("Winner is:" + winner.getClass().getSimpleName());
        System.out.println("Winner's speed:" +winner.getSpeed());
    }
//có 3 layer:
    //1- đi trừu tượng hoá các class của các animal
    //2- controller xử lý trừu tượng cho 1 loại nào đó (Animal)
    //3- xử lý controller cụ thể hoá từng đối tượng-> đưa vào Array asList
//setter: để thay đổi attribute
    //getter: để lấy ra attribute


}
