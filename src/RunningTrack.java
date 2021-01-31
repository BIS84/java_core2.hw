public class RunningTrack implements Run {

    String name;
    int runLenght;
    int i;
    Run p;
    boolean run;

    void runningTrack(Run[] runningPersons, String name, int i, boolean run) {

        this.name = name;
        this.i = i;
        this.run = run;
        p = runningPersons[i];

        if (run) {
            p.run(name);
        }
        else {
            System.out.println(name + " no run.");
        }
    }
}
