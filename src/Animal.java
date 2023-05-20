public abstract class Animal {

        private static int count = 0;
        private int maxRun ;
        private int toDo;
        private int maxSwim;
        private int swim;




        public Animal( ) {
            count++;
        }

        public static int getCount() {
            return count;
        }

     abstract void run( int maxRun,int distanceToDo);
         abstract void swim(int maxSwim, int distanceToDo);


}
