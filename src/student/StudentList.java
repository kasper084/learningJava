package student;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentList {
    private  Student[] list = new Student[100];
    private int p = 0;

    public void add(Student s) {
        list[p++] = s;
    }

    public Student get(int n) {
        return list[n];
    }

    public Student getSu(int s) {
        return list[s];
    }

    public Student getDa(int c) {
        return list[c];
    }

    public int find(String name) {
        for(int i = 0; i < p; i++) {
            if(list[i].getName().equalsIgnoreCase(name))
                return i;
        }
        return -1;
    }

    public int findSur(String surname){
        for(int i = 0; i < p; i++) {
            if(list[i].getSurname().equalsIgnoreCase(surname))
                return i;
        }
        return -1;
    }

    public int findDate(String date) throws Exception {
        Date date1 = new SimpleDateFormat("yyyy,MM,dd").parse(date);
        long millis1 = date1.getTime();

        for(int i = 0; i < p; i++) {
            Date date2 = new SimpleDateFormat("yyyy,MM,dd").parse(list[i].getBirth());
            long millis2 = date2.getTime();
            if(millis1==millis2)
                return i;
        }
        return -1;
    }
}
