package student;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        final StudentList sl = new StudentList();

        sl.add(new Student("Vova","Ivanov",new GregorianCalendar(1986,1,1)));
        sl.add(new Student("Artem","Kasper",new GregorianCalendar(2001,4,20)));
        sl.add(new Student("Jack", "None", new GregorianCalendar(1874,5,25)));

        sl.getNum();
        sl.findName("Vova");
        sl.findSurname("Kasper");
        sl.remove("Vova");
        sl.findName("Vova");
        sl.findDate("25.5.1874");
        sl.showFullInfo();
        sl.findName("Vova");
    }

}

