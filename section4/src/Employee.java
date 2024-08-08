public class Employee {

    String firstName;
    String lastName;
    //max age 100-120 so can put in byte
    byte age;
    //use M/F to save space in database
    char gender;
    static final String EMPLOYER_NAME = "Google";

    public Employee() {
        this("Will", "Smith", (byte) 55, 'M');
        System.out.println("Object is getting created in Default Constructor.....");
    }

    public Employee(String firstName, String lastName, byte age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        System.out.println("Object is getting created in overloaded Constructor.....");
    }

    public byte getAge( ) {
        return age;
    }

    public char getGender( ) {
        return gender;
    }

}
