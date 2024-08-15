package Queues;

public class Main {
    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();
        // add animals to the shelter
        System.out.println("ENQUEUE ANIMALS: add animals to the shelter");
        System.out.println("*********************************************");
        animalShelter.enqueue(new Dog("DogEnzo"));
        animalShelter.enqueue(new Cat("CatMittens"));
        animalShelter.enqueue(new Dog("DogZoe"));
        animalShelter.enqueue(new Cat("CatWhiskers"));
        animalShelter.enqueue(new Dog("DogBuddy"));
        animalShelter.enqueue(new Cat("CatFluffy"));
        animalShelter.enqueue(new Dog("DogMax"));
        animalShelter.enqueue(new Cat("CatSnowball"));
        animalShelter.enqueue(new Dog("DogCharlie"));
        animalShelter.enqueue(new Cat("CatGonzalez"));
        System.out.println();

        // remove animals from the shelter: deque first in first out
        System.out.println("DEQUEUE ANY: First in First out");
        System.out.println("*******************************");
        System.out.println(animalShelter.dequeueAny());
        System.out.println(animalShelter.dequeueAny());

        // remove dogs from the shelter
        System.out.println("DEQUEUE DOGS");
        System.out.println("*************");
        System.out.println(animalShelter.dequeueDog());
        System.out.println(animalShelter.dequeueDog());

        // remove cats from the shelter
        System.out.println("DEQUEUE CATS");
        System.out.println("*************");
        System.out.println(animalShelter.dequeueCat());
        System.out.println(animalShelter.dequeueCat());
}
}
