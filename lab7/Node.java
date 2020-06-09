package lab7;

import lab_6.Car;

public class Node {
    private Car car;
    private Node next;
    private Node previous;

    public Node(Car car, Node next, Node previous) {
        this.car = car;
        this.next = next;
        this.previous = previous;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }


    public Car getCar() {
        return car;
    }
}
