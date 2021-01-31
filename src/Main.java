public class Main {

    public static void main(String[] args) {

        Human vasja = new Human("Vasja", 24);

        Cat barsik = new Cat("Barsik", "black", 3);

        Robot verter = new Robot("Verter", "runnerAndJumper", 1);


        vasja.run("Vasja");
        vasja.jump("Vasja");

        barsik.run("Barsik");
        barsik.jump("Barsik");

        verter.run("Verter");
        verter.jump("Verter");
    }
}