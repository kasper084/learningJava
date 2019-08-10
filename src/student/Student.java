package student;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Student {

    private String name;
    private String surname;
    private GregorianCalendar birth;
    SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy");

    public Student(String name, String surname, GregorianCalendar birth) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        birth.set(birth.get(Calendar.YEAR),birth.get(Calendar.MONTH)-1,birth.get(Calendar.DATE));
    }

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirth() {
        String someDate = date.format(birth.getTime());
        return someDate;
    }

    public void setBirth(GregorianCalendar birth) {
        this.birth = birth;
    }

}
