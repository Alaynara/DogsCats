import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppColections {
    public static void main (String[] args){
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Hogarth"));
        cats.add(new Cat("Chonk"));

        List<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog ("Zeus"));
        dogs.add(new Dog("Hades"));

        List<Animal> pets = new ArrayList<>();

        for (int i = 0; i<cats.size(); i++) {
            pets.add(cats.get(i));
        }
        for (int i=0;i< dogs.size(); i++){
            pets.add(dogs.get(i));
        }
        System.out.println("Our Pets:" + pets);

        Collections.sort(pets);

        System.out.println("Sorted pets:" + pets);
    }
}
