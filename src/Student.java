public class Student {

    int id;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", cgpa=" + cgpa +
                ", name='" + name + '\'' +
                '}';
    }

    double cgpa;
    String name;

    public Student(int id, double cgpa, String name) {
        this.id = id;
        this.cgpa = cgpa;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getName() {
        return name;
    }
}
