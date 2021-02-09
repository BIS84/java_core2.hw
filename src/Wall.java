class Wall implements Jump {

    String name;
    int i;
    Jump j;
    float wallHeight;
    float jumpHeight;

    void wall(Jump[] jumpingPersons, String name, int i, float jumpHeight) {

        this.name = name;
        this.i = i;
        this.jumpHeight = jumpHeight;
        j = jumpingPersons[i];
        wallHeight = 2;

        if (jumpHeight >= wallHeight) {
            j.jump(name);
        }
        else {
            System.out.println(name + " no jump.");
        }
    }
}