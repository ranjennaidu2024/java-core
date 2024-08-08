public class NullDemo {

    public static void main(String[] args) {
        String myString = null;
        Employee employeeObject = null;
        int age = employeeObject.getAge();
        //to manually do the garbage collector
        //but no guarantee java/jvm will take care of that
        //not always will work , can ignore and depend on priority of other task
        System.gc();
    }

}
