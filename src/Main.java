public class Main {

    public static void main(String[] args) {

        Human vasja = new Human("Vasja", 24, 5000, 2.4f);

        Cat barsik = new Cat("Barsik", "black", 3, 2000, 2f);

        Robot verter = new Robot("Verter", "runnerAndJumper", 1, 1500, 1.5f);

        Run[] runningPersons= {vasja, barsik, verter};
        Jump[] jumpingPersons = {vasja, barsik, verter};

/*        vasja.run(vasja.name);
        vasja.jump(vasja.name);

        barsik.run(barsik.name);
        barsik.jump(barsik.name);

        verter.run(verter.name);
        verter.jump(verter.name);*/

        RunningTrack r = new RunningTrack();
        r.runningTrack(runningPersons, vasja.name, 0, vasja.runningLength);
        r.runningTrack(runningPersons, barsik.name, 1, barsik.runningLength);
        r.runningTrack(runningPersons, verter.name, 2, verter.runningLength);

        Wall j = new Wall();
        j.wall(jumpingPersons, vasja.name, 0, vasja.jumpHeight);
        j.wall(jumpingPersons, barsik.name, 1, barsik.jumpHeight);
        j.wall(jumpingPersons, verter.name, 2, verter.jumpHeight);
    }
}