package test;

public class Worker extends Person {

    private String workerNo;

    public Worker(String name, int age, String workerNo) {
        super(name, age);
        this.workerNo = workerNo;
    }

    public void work(){
        System.out.println("I love working.");
    }

    @Override
    public void eat() {
        System.out.println("Worker is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Worker is sleeping.");
    }
}
