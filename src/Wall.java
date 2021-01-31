class Wall implements Jump {

    String name;
    int i;
    Jump j;
    boolean jump;

    void wall(Jump[] jumpingPersons, String name, int i, boolean jump) {

        this.name = name;
        this.i = i;
        this.jump = jump;
        j = jumpingPersons[i];

        if (jump) {
            j.jump(name);
        }
        else {
            System.out.println(name + " no jump.");
        }
    }
}
