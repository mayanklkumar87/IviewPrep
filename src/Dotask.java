import java.util.Date;
import java.util.List;

public class Dotask {

    private int taskId;
    private int taskPriority;
    private String taskDescription;
    private Date taskStartDate;

    private String taskDuration;

    private List<Dotask> subTasks;

    public Dotask(int taskId, int taskPriority, String taskDescription) {
        this.taskId = taskId;
        this.taskPriority = taskPriority;
        this.taskDescription = taskDescription;
    }

    public Dotask(int taskId, int taskPriority, String taskDescription, Date taskStartDate, String taskDuration,
                  List<Dotask> subTasks) {
        this.taskId = taskId;
        this.taskPriority = taskPriority;
        this.taskDescription = taskDescription;
        this.taskStartDate = taskStartDate;
        this.taskDuration = taskDuration;
        this.subTasks = subTasks;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(int taskPriority) {
        this.taskPriority = taskPriority;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Date getTaskStartDate() {
        return taskStartDate;
    }

    public void setTaskStartDate(Date taskStartDate) {
        this.taskStartDate = taskStartDate;
    }

    public String getTaskDuration() {
        return taskDuration;
    }

    public void setTaskDuration(String taskDuration) {
        this.taskDuration = taskDuration;
    }

    public List<Dotask> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(List<Dotask> subTasks) {
        this.subTasks = subTasks;
    }

    @Override
    public String toString() {
        return "Dotask{" +
                "taskId=" + taskId +
                ", taskPriority=" + taskPriority +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskStartDate=" + taskStartDate +
                ", taskDuration='" + taskDuration + '\'' +
                ", subTasks=" + subTasks +
                '}';
    }
}
