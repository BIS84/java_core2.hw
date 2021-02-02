package HW1;

class Human implements Run, Jump {

    String name;
    int age;
    float jumpHeight;
    int runningLength;

    Human(String name, int age, int runningLength, float jumpHeight) {
        this.name = name;
        this.age = age;
        this.jumpHeight = jumpHeight;
        this.runningLength = runningLength;
    }
}
