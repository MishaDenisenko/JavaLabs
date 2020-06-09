import java.util.*;

//C11 = 1

public class lab_4 {
    public static void main(String[] args) {
        School[] schools = {new School("82", 350, 2800, 4, 4030, 250),
                new School("97", 420, 3520, 6, 5010, 390),
                new School("24", 270, 2100, 3, 3000, 250),
                new School("102", 290, 2600, 3, 3258, 280),
                new School("64", 410, 3000, 5, 4801, 300),
                new School("91", 320, 2600, 4, 3753, 259),
                new School("56", 200, 3000, 5, 3000, 400)};

        System.out.println("Список школ и их параметров:\n");
        for (School school : schools){
            System.out.println(school);
        }

        SchoolComparatorPupils pupilsComparator = new SchoolComparatorPupils();
        Arrays.sort(schools, pupilsComparator);

        System.out.println("\nСортированный по кол-ву студентов список школ по возрастанию:\n");
        for (School school : schools){
            System.out.println(school);
        }

        SchoolComparatorFloors floorsComparator = new SchoolComparatorFloors();
        Arrays.sort(schools, floorsComparator);

        System.out.println("\nСортированный по кол-ву этажей список школ по убыванию:\n");
        for (School school : schools){
            System.out.println(school);
        }
    }
}

class School {
    Integer teachers, pupils, floors, desks, classrooms;
    String name;
    public School(String name, int teachers, int pupils, int floors, int desks, int classrooms) {
        this.name = name;
        this.teachers = teachers;
        this.pupils = pupils;
        this.floors = floors;
        this.desks = desks;
        this.classrooms = classrooms;
    }

    public Integer getPupils() { return pupils;}
    public Integer getFloors() { return floors;}

    public String toString(){
        return "School{ " +
                "school " + name + ":" +
                ", quantity of teachers = " + teachers+
                ", quantity of pupils = " + pupils +
                ", quantity of floors = " + floors +
                ", quantity of desks = " + desks +
                ", quantity of classrooms = " + classrooms +
                '}';
    }
}

class SchoolComparatorPupils implements Comparator<School>  {
    public int compare(School a, School b) {
        return a.getPupils().compareTo(b.getPupils());
    }
}

class SchoolComparatorFloors implements Comparator<School>  {
    public int compare(School a, School b) {
        return b.getFloors().compareTo(a.getFloors());
    }
}