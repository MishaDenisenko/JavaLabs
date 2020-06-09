package lab7;

import lab_6.Car;

import java.util.*;

public class MyList implements List<Car> {

    private Node head;
    private Node tail;
    private int size;

    public MyList() {
    }

    public MyList(Car car) {
        //add car to collection
        add(car);
    }

    public MyList(Collection<? extends Car> collection) {
        // add collection`s elements to this collection
        addAll(collection);
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Car car : this) {
            if (car.equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Car> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator<Car>{
        protected Node currentNode = head;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public Car next() {
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            Car car = currentNode.getCar();
            currentNode = currentNode.getNext();
            return car;
        }
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean add(Car car) {
        Node node = new Node(car, null, tail);
        if (head == null){
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Car> collection) {
        for (Car car : collection) {
            add(car);
        }
        return true;
    }

    @Override
    public boolean addAll(int i, Collection<? extends Car> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Car get(int i) {
        return null;
    }

    @Override
    public Car set(int i, Car car) {
        return null;
    }

    @Override
    public void add(int i, Car car) {

    }

    @Override
    public Car remove(int i) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Car> listIterator() {
        return new MyListIterator();
    }

    class MyListIterator extends MyIterator implements ListIterator<Car>{
//
//        @Override
//        public boolean hasNext() {
//            return false;
//        }
//
//        @Override
//        public Car next() {
//            return null;
//        }

        @Override
        public boolean hasPrevious() {
            return currentNode.getPrevious() != null;
        }

        @Override
        public Car previous() {
            currentNode = currentNode.getPrevious();
            return currentNode.getCar();
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(Car car) {

        }

        @Override
        public void add(Car car) {

        }
    }

    @Override
    public ListIterator<Car> listIterator(int i) {
        return null;
    }

    @Override
    public List<Car> subList(int i, int i1) {
        return null;
    }
}
