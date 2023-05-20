public class Cat extends Animal {
    public static int count;
    private String name;

    public Cat(String name) {
       this.name=name;

        count++;

    }

    ;

    @Override
    void run(int maxRun, int distanceToDo) {
        if (maxRun >= distanceToDo && distanceToDo > 0) {
            System.out.println(" Cat " + name + " run " + distanceToDo + " m ");
        }


    }

    @Override
    void swim(int maxSwim, int distanceToDo) {
        if (maxSwim >= distanceToDo && distanceToDo > 0) {
            System.out.println(" Cat can not swim");
        } else {
            System.out.println("A Cat can not swim at all");
        }

    }
    public static int getCount( ){
        return count;
    }
}


