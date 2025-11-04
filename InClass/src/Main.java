import java.util.Arrays;
public class Main{

    public static void main (String[] args) {
        Animal a = new Animal("an animal");
        System.out.println("Aminal: " + a);

        Dog[] dogs = new Dog[3];
        dogs [0] = new Dog("Jellybean");
        dogs [1] = new Dog ("Charlotte");
        dogs [2] = new Dog ("Ginger");

        Cat[] cats = new Cat[3];
        cats [0] = new Cat ("Izimi");
        cats [1] = new Cat ("Piper");
        cats [2] = new Cat ("Twila");

        Animal [] pets = new Animal[dogs.length + cats.length];

        for (int i=0; i < dogs.length ; i++){
            pets[i] = dogs[i];
        }
        for (int i=0; i < cats.length ; i++) {
            pets[i] = cats[i];
        }
        for (int i=0; i<pets.length; i++){
            System.out.println("Our Pets:" + pets[i]);
        }
        Arrays.sort(pets);

        for (int i=0; i<pets.length; i++) {
            System.out.println("Sorted Pets:" + Arrays.toString(pets));
        }

        }

    }


