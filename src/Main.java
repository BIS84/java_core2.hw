public class Main {

    public static void main(String[] args) {

        Human vasja = new Human("Vasja", 24, true, true);

        Cat barsik = new Cat("Barsik", "black", 3, true, true);

        Robot verter = new Robot("Verter", "runnerAndJumper", 1, true, true);

        Run[] runningPersons= {vasja, barsik, verter};
        Jump[] jumpingPersons = {vasja, barsik, verter};


/*        vasja.run(vasja.name);
        vasja.jump(vasja.name);

        barsik.run(barsik.name);
        barsik.jump(barsik.name);

        verter.run(verter.name);
        verter.jump(verter.name);*/

        RunningTrack r = new RunningTrack();
        r.runningTrack(runningPersons, "Vasja", 0, true);
        r.runningTrack(runningPersons, "Barsik", 1, true);
        r.runningTrack(runningPersons, "Verter", 2, true);

        Wall j = new Wall();
        j.wall(jumpingPersons, "Vasja", 0, true);
        j.wall(jumpingPersons, "Barsik", 1, true);
        j.wall(jumpingPersons, "Verter", 2, true);
    }
}