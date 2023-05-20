public class Dog extends Animal{
    public static int count;
    private String name;

    public Dog(String name) {
        super();
        this.name = name;
        count++;
    }


    @Override
    void run(int maxRun, int distanceToDo) {
        if (maxRun >= distanceToDo && distanceToDo > 0) {
            System.out.println(" Dog " + name + " run " + distanceToDo + " м ");
        }


    }

    @Override
    void swim(int maxSwim, int distanceToDo) {
        if (maxSwim >= distanceToDo && distanceToDo > 0) {
   System.out.println("Dog" + name+ "swim" + distanceToDo+ "m");

    }

    }
    public static int getCount(){
        return count;
}

}
