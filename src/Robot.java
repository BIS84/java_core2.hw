class Robot implements Run, Jump {

    String name;
    String model;
    int serialNumber ;
    boolean run;
    boolean jump;

    Robot(String name, String model, int serialNumber, boolean run, boolean jump) {
        this.name = name;
        this.model = model;
        this.serialNumber = serialNumber;
        this.run = run;
        this.jump = jump;
    }
}