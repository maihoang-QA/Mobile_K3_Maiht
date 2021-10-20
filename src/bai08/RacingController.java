package bai08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RacingController {
    public static void main(String[] args) {
        Animal tiger = new Tiger() ;
        Animal horse = new Horse();
        Animal falcon = new Falcon();
        Animal eagle = new Eagle();
        Animal dog = new Dog();

        List<Animal> animalList = Arrays.asList(tiger,horse,falcon,eagle,dog);
        System.out.println("tiger speed:" + tiger.getSpeed());
        System.out.println("horse speed:" + horse.getSpeed());
        System.out.println("falcon speed:" +falcon.getSpeed());
        System.out.println("eagle speed:" +eagle.getSpeed());
        System.out.println("dog speed:" +dog.getSpeed());

        Animal winner = check(animalList);
        System.out.println("Animal winner:" + winner.getClass().getSimpleName());

    }


    static Animal check(List<Animal> animalList) {
        Animal winner = null;
        for (Animal currentAnimal : animalList) {

            if (currentAnimal.flyable()) {
                System.out.println(currentAnimal.getClass().getSimpleName() + " is not qualified for the test");
            } else {
                if (winner == null) {
                    winner = currentAnimal;
                } else {
                    if (winner.getSpeed() < currentAnimal.getSpeed()) {
                        winner = currentAnimal;
                    }
                }

            }


        }
        return winner;
    }
}
