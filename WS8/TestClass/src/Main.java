class Student {
    String name;
    int id;

    public Student() {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
    }

    static void pr(String msg) {
        System.out.print(msg);
    }
}
