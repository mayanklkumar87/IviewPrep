import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {

    public static List<Student> getStudents(List<String> inputList) {
        List<Student> studentList = new ArrayList<>();
        PriorityQueue<Student> sortedList = new PriorityQueue<>(Comparator.comparingDouble(Student::getCgpa)
                .reversed().thenComparing(Student::getName).thenComparingInt(Student::getId));
        for(String input : inputList) {
            String[] test = input.split(" ");
            int id = Integer.valueOf(test[0]);
            double cgpa = Double.valueOf(test[1]);
            String name = test[2];
            Student stu = new Student(id, cgpa,name);
            sortedList.add(stu);
        }
        while (!sortedList.isEmpty()) {
            studentList.add(sortedList.poll());
        }

        return studentList;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<String> inputList = new ArrayList<>();
        inputList.add("1 6.22 Mayank");
        inputList.add("5 8.40 Rohan");
        inputList.add("4 7.22 Mohini");
        for (Student output : getStudents(inputList)) {
            System.out.println(output.toString());
        }
    }

}
