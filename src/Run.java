interface Run {

    default void run(String name) {
        System.out.println(name + " run.");
    }
}