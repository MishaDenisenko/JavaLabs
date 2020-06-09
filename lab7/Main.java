package lab7;

import lab_6.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//C2 = 0, C3 = 2

public class Main {
    public static void main(String[] args) {
        MyList myList1 = new MyList(new Car(1));
        myList1.add(new Car(11));
        myList1.add(new Car(21));

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Car(31));
        arrayList.add(new Car(21));
        MyList myList2 = new MyList(arrayList);

        Iterator iterator = myList2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("----------");

        ListIterator listiterator = myList2.listIterator();
        System.out.println(listiterator.next());
        System.out.println(listiterator.previous());

        System.out.println("\nномер 21 в myList2: " + myList2.contains(new Car(21)));
    }
}
