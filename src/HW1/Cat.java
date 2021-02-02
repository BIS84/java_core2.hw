package HW1;

class Cat implements Run, Jump {

    String name;
    String color;
    int age;
    int runningLength;
    float jumpHeight;

    Cat(String name, String color, int age, int runningLength, float jumpHeight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.runningLength = runningLength;
        this.jumpHeight = jumpHeight;
    }
}
