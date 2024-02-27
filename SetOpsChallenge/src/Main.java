import java.util.*;

public class Main {
    public static void main(String[] args) {

        Comparator<Task> sortByPriority = Comparator.comparing(Task::getPriority);
        Set<Task> annTasks = TaskData.pushGetData("Ann");
        Set<Task> bobTasks = TaskData.pushGetData("Bob");
        Set<Task> carolTasks = TaskData.pushGetData("Carol");
        Set<Task> allTasks = TaskData.pushGetData(" ");
        List<Set<Task>> sets = List.of(annTasks, bobTasks, carolTasks);
        Set<Task> assignedTasks = getUnion(sets);
        System.out.println("+".repeat(90));
        sortAndPrint("Assigned Tasks", assignedTasks);
        System.out.println("+".repeat(90));
        Set<Task> everyTask = getUnion(List.of(allTasks, assignedTasks));
        sortAndPrint("The True All Tasks", everyTask);

        Set<Task> missingTasks = getDifference(everyTask, allTasks);
        sortAndPrint("Missing Tasks", missingTasks);

        Set<Task> unassignedTasks = getDifference(allTasks, assignedTasks);
        sortAndPrint("Unassigned Tasks", unassignedTasks, sortByPriority);

        Set<Task> overlap = getUnion(List.of(
                getIntersect(annTasks, bobTasks),
                getIntersect(carolTasks, bobTasks),
                getIntersect(annTasks, carolTasks)
        ));
        sortAndPrint("Assigned to Multiples", overlap, sortByPriority);

        List<Task> overlapping = new ArrayList<>();
        for (Set<Task> set : sets) {
            Set<Task> dupes = getIntersect(set, overlap);
            overlapping.addAll(dupes);
        }
        Comparator<Task> priorityNatural = sortByPriority.thenComparing(
                Comparator.naturalOrder());

        sortAndPrint("Overlapping", overlapping, priorityNatural);
    }

    /*Create a getUnion method, that takes a List of Sets,
    and will return the union of all the sets.*/
    private static Set<Task> getUnion(List<Set<Task>> taskList) {
        Set<Task> result = new HashSet<>();
        for (var t : taskList) {
            result.addAll(t);
        }
        return result;
    }

    /*Create a getIntersect method, that takes two Sets,
    and returns the intersection of the sets.*/
    private static Set<Task> getIntersect(Set<Task> set1, Set<Task> set2) {
        Set<Task> intersection = new HashSet<>(set1);//initialize new Set<> with another Set<>
        intersection.retainAll(set2);

        return intersection;
    }

    /*Create a getDifference method, that takes two Sets,
    and removes the second argument's set from the first*/
    private static Set<Task> getDifference(Set<Task> set1, Set<Task> set2) {
        Set<Task> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        return difference;
    }
    private static void sortAndPrint(String header, Collection<Task> collection) {
        sortAndPrint(header, collection, null);
    }
    private static void sortAndPrint(String header, Collection<Task> collection,
                                     Comparator<Task> sorter) {
        String lineSeparator = "_".repeat(90);
        System.out.println(lineSeparator);
        System.out.println(header);
        System.out.println(lineSeparator);

        List<Task> list = new ArrayList<>(collection);
        list.sort(sorter);
        list.forEach(System.out::println);
    }
}