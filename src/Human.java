class Human implements Run, Jump {

    String name;
    int age;
    boolean run;
    boolean jump;

    Human(String name, int age, boolean run, boolean jump) {
        this.name = name;
        this.age = age;
        this.run = run;
        this.jump = jump;
    }
}
