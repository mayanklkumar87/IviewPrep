import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class StudentPriorities {

    public List<Students> getStudents(List<String> events) {
        List<Students> studentList = new ArrayList<>();
        PriorityQueue<Students> que = new PriorityQueue<>(Comparator.comparingDouble(Students::getCgpa)
                .reversed().thenComparing(Students::getName).thenComparingInt(Students::getId));
        for (String test : events) {
            if (test.startsWith("E")) {
                String temp[] = test.split("\\s");
                Students s = new Students(Integer.valueOf(temp[3]), temp[1], Double.valueOf(temp[1]));
                que.add(s);
            }
        }
        while (!que.isEmpty()) {
            studentList.add(que.poll());
        }
        return studentList;
    }

}
