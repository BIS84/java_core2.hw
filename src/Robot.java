class Robot implements Run, Jump {

    String name;
    String model;
    int serialNumber ;

    Robot(String name, String model, int serialNumber) {
        this.name = name;
        this.model = model;
        this.serialNumber = serialNumber;
    }
}