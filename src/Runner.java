public class Runner {

    String name;
    int age;
    double Speed;

    public Runner(String name, int age, float Speed) {
        this.name = name;
        this.age = age;
        this.Speed = Speed;
    }

    public void info() {
        System.out.println(name +" "+age+" "+ Speed);
    }

    public String getName() {
        return name;
    }

    public double getAverageSpeed() {
        return Speed;
    }
}
