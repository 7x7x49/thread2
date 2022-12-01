public class Main {

    private static final int[] ARRAY1 = new int[] {1, 123, 2, 3};
    private static final int[] ARRAY2 = new int[] {1, 123, 2, 3};
    private static final int[] ARRAY3 = new int[] {1, 123, 2, 3};

    public static void main(String[] args) {
        new SaveAsThread(1, ARRAY1).start();
        new SaveAsThread(2, ARRAY2).start();
        new SaveAsThread(3, ARRAY3).start();
    }
}