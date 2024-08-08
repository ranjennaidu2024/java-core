public class MemoryIssue {
    private static final int SIZE = 1000000;
    private final int[] list;

    public MemoryIssue() {
        list = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            list[i] = i;
        }
    }

    public int getSum() {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        MemoryIssue memoryIssue = new MemoryIssue();
        System.out.println("Sum: " + memoryIssue.getSum());
    }
}
