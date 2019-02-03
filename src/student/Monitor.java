package student;

public class Monitor {
    public static void main(String[] args) throws Exception {
        final StudentList sl = new StudentList();

        sl.add(new Student("Vova","Ivanov","1986,1,1"));
        sl.add(new Student("Vasya","Pupkin","1970,3,28"));
        sl.add(new Student("Vasya1","Pupkin1","1970,3,28"));
        sl.rm(1);
        int n = sl.find("Vova");
        int s = sl.findSur("Pupkin");
        int c = sl.findDate("1970,3,28");

        System.out.println(sl.get(n).getName().toString() + "  " + sl.get(n).getSurname() + " " + sl.get(n).getBirth().toString());
        System.out.println(sl.get(s).getName().toString() + "  " + sl.get(s).getSurname() + " " + sl.getSu(s).getBirth().toString());
        System.out.println(sl.get(c).getName().toString() + "  " + sl.get(c).getSurname() + " " + sl.getDa(c).getBirth().toString());
    }
}
