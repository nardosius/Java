import java.util.*;

public class TaskData {

private static final String allTasks = """
        Infrastructure, Logging, High
        Infrastructure, DB Access, Medium
        Infrastructure, Security, High
        Infrastructure, Password Policy, Medium
        Data Design, Task Table, Medium
        Data Design, Employee Table, Medium
        Data Design, Cross Reference Tables, High
        Data Design, Encryption Policy, High
        Data Access, Write Views, Low
        Data Access, Set Up Users, Low
        Data Access, Set Up Access Policy, Low
        """;

private static final String annTasks = """
        Infrastructure, Security, High, In Progress
        Infrastructure, Password Policy, Medium, In Progress
        Research, Cloud solutions, Medium, In Progress
        Data Design, Encryption Policy, High
        Data Design, Project Table, Medium
        Data Access, Write Views,Low, In Progress
        """;

private static final String bobTasks = """
        Infrastructure, Security, High, In Progress
        Infrastructure, Password Policy, Medium
        Data Design,Encryption Policy,High
        Data Access,Write Views, Low, In Progress
        """;

private static final String carolTasks = """
        Infrastructure, Logging, High, In Progress
        Infrastructure, DB Access, Medium
        Infrastructure, Password Policy, Medium
        Data Design, Task Table, High
        Data Access, Write Views, Low
        """;

    public static Set<Task> getData(String owner) {
        Set<Task> taskList = new HashSet<>();
        String user = ("ann,bob,carol".contains(owner.toLowerCase())) ? owner : null;

        String selectedList = switch (owner.toLowerCase()) {
            case "ann" -> annTasks;
            case "bob" -> bobTasks;
            case "carol" -> carolTasks;
            default -> allTasks;
        };
//        populate String[] data
        for (String taskData : selectedList.split("\n")) {
            String[] data = taskData.split(",");
            Arrays.asList(data).replaceAll(String::trim);
//Pay very close attention. Can equate a variable to the output of a ternary expression
            Status status = (data.length <= 3) ? Status.IN_QUEUE :
                    Status.valueOf(data[3].toUpperCase().replace(' ', '_'));

            Priority priority = Priority.valueOf(data[2].toUpperCase());
            taskList.add(new Task(data[0], data[1], user, priority, status));
        }

        return taskList;
    }

   public static Set<Task> pushGetData(String owner) {
       return getData(owner);
   }


}
