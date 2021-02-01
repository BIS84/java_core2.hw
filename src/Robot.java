class Robot implements Run, Jump {

    String name;
    String model;
    int serialNumber ;
    int runningLength;
    float jumpHeight;

    Robot(String name, String model, int serialNumber, int runningLength, float jumpHeight) {
        this.name = name;
        this.model = model;
        this.serialNumber = serialNumber;
        this.runningLength = runningLength;
        this.jumpHeight = jumpHeight;
    }
}
