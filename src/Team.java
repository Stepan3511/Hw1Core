public class Team {

    String teamName;
    Runner[] team;

    public Team(Runner[] team, String teamName) {
        this.teamName = teamName;
        this.team = team;
    }

    public String getTeamName() {
        return teamName;
    }

    public Runner[] getTeam() {
        return team;
    }
}
