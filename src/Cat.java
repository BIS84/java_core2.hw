class Cat implements Run, Jump {

    String name;
    String color;
    int age;
    boolean run;
    boolean jump;

    Cat(String name, String color, int age, boolean run, boolean jump) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.run = run;
        this.jump = jump;
    }
}
