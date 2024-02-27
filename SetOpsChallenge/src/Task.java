import java.util.HashSet;
import java.util.Set;

enum Status {IN_QUEUE, ASSIGNED, IN_PROGRESS}
enum Priority {HIGH, MEDIUM, LOW}

public class Task implements Comparable<Task> {
    private String projectName;
    private String taskDescription;
    private String assignee;
    Priority priority;
    Status status;

    public Task(String projectName, String taskDescription, String assignee,
                 Priority priority, Status status) {
        this.projectName = projectName;
        this.taskDescription = taskDescription;
        this.assignee = assignee;
        this.priority = priority;
        this.status = status;
        }
    public Task(String project, String description, String assignee, Priority priority) {
        this(project, description, assignee, priority,
                assignee == null ? Status.IN_QUEUE : Status.ASSIGNED);
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (!getProjectName().equals(task.getProjectName())) return false;
        return getTaskDescription().equals(task.getTaskDescription());
    }

    @Override
    public int hashCode() {
        int result = getProjectName().hashCode();
        result = 31 * result + getTaskDescription().hashCode();
        return result;
    }

    @Override
    public int compareTo(Task o) {
        int result = this.projectName.compareTo(o.projectName);
        if (result == 0) {
            result = this.taskDescription.compareTo(o.taskDescription);
        }
        return result;
    }

    @Override
    public String toString() {
        return "%-20s %-25s %-10s %-10s %s".formatted(projectName, taskDescription,
                priority, assignee, status);
    }
}
