package Queues;

import java.util.LinkedList;

public class AnimalShelter {
    private final LinkedList<Dog> dogs;
    private final LinkedList<Cat> cats;
    private int order;

    public AnimalShelter() {
        dogs = new LinkedList<>();
        cats = new LinkedList<>();
        order = 0;
    }

    // Enqueue: Add an animal to the shelter
    public void enqueue(Animal animal) {
        animal.setOrder(order);
        order++;

        if (animal instanceof Dog) {
            dogs.addLast((Dog) animal);
            System.out.println("Dog: " + animal.getName() + " is added to the shelter");
        } else if (animal instanceof Cat) {
            cats.addLast((Cat) animal);
            System.out.println("Cat: " + animal.getName() + " is added to the shelter");
        }
    }

    // DequeueAny: Remove the oldest animal from the shelter
    public Animal dequeueAny() {
        if (dogs.isEmpty()) {
            return dequeueCat();
        } else if (cats.isEmpty()) {
            return dequeueDog();
        }

        Dog oldestDog = dogs.peek();
        Cat oldestCat = cats.peek();

        if (oldestDog.isOlderThan(oldestCat)) {
            return dequeueDog();
        } else {
            return dequeueCat();
        }
    }

    // DequeueDog: Remove the oldest dog from the shelter
    public Dog dequeueDog() {
        return dogs.poll();
    }

    // DequeueCat: Remove the oldest cat from the shelter
    public Cat dequeueCat() {
        return cats.poll();
    }
}
