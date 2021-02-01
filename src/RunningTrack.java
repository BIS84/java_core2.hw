class RunningTrack implements Run {

    String name;
    int runningLength;
    int i;
    int runningTrackLength;
    Run p;

    void runningTrack(Run[] runningPersons, String name, int i, int runningLength) {

        this.name = name;
        this.i = i;
        this.runningLength = runningLength;
        p = runningPersons[i];
        runningTrackLength = 3000;

        if (runningLength >= runningTrackLength) {
            p.run(name);
        }
        else {
            System.out.println(name + " no run.");
        }
    }
}

