public class MainClass {
    public static void main(String[] args) {

        Runner[] groupOne = new Runner[4];
        groupOne[0] = new Runner("Katya",45, 19.5f);
        groupOne[1] = new Runner("Marina",45, 19.5f);
        groupOne[2] = new Runner("Natasha",25, 12f);
        groupOne[3] = new Runner("Olya",20, 9.2f);

        Runner[] groupTwo = new Runner[4];
        groupTwo[0] = new Runner("Goga",30, 10.8f);
        groupTwo[1] = new Runner("Sokol",34, 9.9f);
        groupTwo[2] = new Runner("Vlad",40, 15.5f);
        groupTwo[3] = new Runner("Bayaz",22, 12.5f);

        Team teamOne = new Team(groupOne, "Venera");
        Team teamTwo = new Team(groupTwo, "Mars");


        Course race = new Course();
        race.doit(teamOne);
        race.doit(teamTwo);
    }
}
