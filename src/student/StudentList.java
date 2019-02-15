package student;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentList {

    private ArrayList<Student> list = new ArrayList<>();

    public void add(Student s) {
        list.add(s);
    }

    public Student get(int n) {
        return list.get(n);
    }

    public Student getSu(int s) {
        return list.get(s);
    }

    public Student getDa(int c) {

        return list.get(c);
    }

    public int find(String name) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equalsIgnoreCase(name))
                return i;
        }
        return -1;
    }

    public int findSur(String surname){
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getSurname().equalsIgnoreCase(surname))
                return i;
        }
        return -1;
    }

    public int findDate(String date) throws Exception {
        Date date1 = new SimpleDateFormat("yyyy,MM,dd").parse(date);
        long millis1 = date1.getTime();

        for(int i = 0; i < list.size(); i++) {
            Date date2 = new SimpleDateFormat("yyyy,MM,dd").parse(list.get(i).getBirth());
            long millis2 = date2.getTime();
            if(millis1==millis2)
                return i;
        }
        return -1;
    }
    public void rm(int rem){
        list.remove(rem);
    }
}
