package ermolich_homework.task_11;

public class Main {
    public static void main(String[] args) {

        Cook cook1 = new Cook("Xiaomi", 220, "Japan", "лопатка", false);
        Deminer deminer1 = new Deminer("RS13", 380, "взрывчатка", "Железо", false);
        Builder builder1 = new Builder("KG", "France", 1200, "Ковш", "алюминий", false);

        cook1.repair();
        deminer1.repair();
        builder1.repair();

        cook1.on();
        deminer1.on();
        builder1.on();

        Robot[] show = {cook1, deminer1, builder1};
        for (Robot r: show) {
            r.uniquePossibility();
        }

        Engineer[] showEngineer = {deminer1, builder1};
        for (Engineer e: showEngineer) {
            e.createItem();
        }

        Deminer[] showDeminer = {deminer1};
        for (Deminer d: showDeminer) {
            d.createItem();
        }

    }
}
