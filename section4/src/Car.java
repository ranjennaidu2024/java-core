public class Car {

    String model;
    String color;
    int horsePower;
    //static variable belong to class than object, shared among all objects of class
    //final so that others cant change directly from other class
    static final byte NO_OF_WHEELS = 4;
    static  byte noOfEngines;

    //static initialization block will executed first before the main method.
    static {
        noOfEngines = 1;
        System.out.println("static blocking is being executed");
        //assume we calling main method after this,
        //if we put exit 0 or -1 here it wont execute the main method
        //System.out.exit(0);
    }
    //instance initialization block - initialize each time object created
    //similar to constructor but for Anonymous class we dont constuctor , so we use this
    //also instead use duplicate code in different constructors , can use this
    //common code for both different constructor code can use here
    {
        System.out.println("Car object is being created....");
    }

    public Car () {

    }

    public Car (String model, String color, int horsePower) {
        this.model = model;
        this.horsePower = horsePower;
        this.color =color;
    }

    public void startCar( ) {
        System.out.println("Vehicle started...");
    }

    public String stopCar( ) {
        String output = "Vehicle stopped...";
        return output;
    }

}
