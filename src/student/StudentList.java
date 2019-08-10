package student;

import java.util.ArrayList;

public class StudentList {
    private  ArrayList<Student> list = new ArrayList<>();
    private int num;

    public void add(Student student) {
        list.add(student);
        num = list.size();
    }

    public int getNum() {
        System.out.println(num);
        return num;
    }

    public int findName(String name) {
        for(int some = 0; some < num; some++) {
            if(list.get(some).getName().equalsIgnoreCase(name)) {
                getFullInfo(some);
                return some;
            }
        }
        return 0;
    }

    public int findSurname(String surName) {
        for(int some = 0; some < num; some++) {
            if(list.get(some).getSurname().equalsIgnoreCase(surName)) {
                getFullInfo(some);
                return some;
            }
        }
        return 0;
    }

    public int findDate(String date) {
        for(int some = 0; some < num; some++) {
            if(list.get(some).getSurname().equalsIgnoreCase(date)) {
                getFullInfo(some);
                return some;
            }
        }
        return 0;
    }

    public void remove(String name) {
        for(int some = 0; some < num; some++) {
            if (list.get(some).getName().equalsIgnoreCase(name)) {
                list.remove(some);
                num--;
            }
        }
    }

    public int getFullInfo(int some) {
        String info = String.format("%s %s %s", list.get(some).getName(),
                list.get(some).getSurname(), list.get(some).getBirth());
        System.out.println(info);
        return 0;
    }

    public int showFullInfo() {
        for (int some = 0; some < num; some++)
                getFullInfo(some);
        return 0;
    }

}
