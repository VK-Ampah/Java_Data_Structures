package Queues;


public class Animal {
    private String name;
    private int order;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isOlderThan(Animal other) {
        return this.order < other.order;
    }
}
