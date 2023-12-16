interface Player {

    String name();
}
record BaseballPlayer(String name, String position) implements Player {}
record FootballPlayer(String name, String position) implements Player {}//can now instantiate a football player with SportsTeam
record VolleyballPlayer(String name, String position) implements Player{}
public class Main {

    public static void main(String[] args) {
        var philly = new Affiliation("Philadelphia, PA", "city", "US");

        BaseballTeam phillies = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros = new BaseballTeam("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        SportsTeam phillies1 = new SportsTeam("Philadelphia Phillies1");
        SportsTeam astros1 = new SportsTeam("Houston Astros1");
        scoreResult(phillies1, 3, astros1, 5);

        Team<BaseballPlayer, Affiliation> phillies2 = new Team<>("Philadelphia Phillies2", philly);
//        can also pass String in place of Affiliation since no upper bound on Affiliation.
        Team<BaseballPlayer, Affiliation> astros2 = new Team<>("Houston Astros2");
        /*parameterize instances above to avoid raw type use warning*/
        scoreResult(phillies2, 3, astros2, 5);

        var harper = new BaseballPlayer("Harper", "Pitcher");
        var marsh = new BaseballPlayer("Marsh", "Right-Fielder");
        var guthrie = new BaseballPlayer("Guthrie", "Center Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.addTeamMember(guthrie);
        phillies.listTeamMembers();
        phillies2.listTeamMembers();

        SportsTeam afc1 = new SportsTeam("Adelaide Crows");
        Team<FootballPlayer, Affiliation> afc = new Team<>("Adelaide Crows");
        var tex = new FootballPlayer("Tex Walker", "Half-Centre Forward");
        var rory = new FootballPlayer("Rory Laird", "Midfield");
        afc.addTeamMember(tex);
        afc1.listTeamMembers();
        afc.addTeamMember(rory);
        afc.listTeamMembers();//no data typing for different sports. Can add a baseball player to a football team. how to fix?
//see Team class....
        Team<BaseballPlayer, Affiliation> adelaide =  new Team<>("Adelaide Storm");
        adelaide.addTeamMember(new BaseballPlayer("N Roberts", "Center-Fielder"));
        adelaide.listTeamMembers();
    }

    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s, %s, %s, %n", team1, message, team2);
    }
//Create overloaded method using SportsTeam
    public static void scoreResult(SportsTeam team1, int t1_score, SportsTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s, %s, %s, %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s, %s, %s, %n", team1, message, team2);
    }
}
