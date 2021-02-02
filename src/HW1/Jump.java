package HW1;

interface Jump {

    default void jump(String name) {
        System.out.println(name + " jump.");
    }
}