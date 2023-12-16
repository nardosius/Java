import java.util.ArrayList;
import java.util.List;
record Affiliation(String name, String type, String countryCode) {
    @Override//methods coded inside a record will be executed like methods inside a constructor.
    public String toString() {
        return name + " (" + type + " in " + countryCode + ")";
    }
}
public class Team<T extends Player, S> {//typing a class with "<T>" allows you to specify a type of object so that it cannot be mistakenly
    //added to other object types like what happened to SportsTeam
/*The "extends" designator is NOT the same as extending for a class or abstract. It specifies an upper bound, or highest parent
* class or interface that can be included in they types the class will take*/
    private String teamName;
    private List<T> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;
    private S affiliation;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, S affiliation) {
        this.teamName = teamName;
        this.affiliation = affiliation;
    }



    public void addTeamMember(T t) {
        if (!teamMembers.contains(t)) {
            teamMembers.add(t);
        }
    }

    public void listTeamMembers() {
        System.out.print(teamName + " Roster:");
        System.out.println(affiliation == null ? "" : "AFFILIATION: " + affiliation);
//        System.out.println(teamMembers);
        for (T t : teamMembers) {
            System.out.println(t.name());
        }
    }

    public int ranking() {
        return (totalLosses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore) {
        String message = "lost to:";
        if (ourScore > theirScore) {
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "tied";
        } else {
            totalLosses++;
        }
        return message;
    }

    @Override
    public String toString() {
        return teamName + " (Ranked " + ranking() + ")";
    }
}
