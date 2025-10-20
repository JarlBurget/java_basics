package week8.Ex10;

public class Main {
    public static void main(String[] args) {
        NationalService civil = new CivilService();
        NationalService military = new MilitaryService(150);

        System.out.println("Civil days left: " + civil.getDaysLeft());
        civil.work();
        civil.work();
        System.out.println("Civil days left after 2 days of work: " + civil.getDaysLeft());

        System.out.println("Military days left: " + military.getDaysLeft());
        military.work();
        System.out.println("Military days left after 1 day of work: " + military.getDaysLeft());
    }
}
