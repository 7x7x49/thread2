import java.io.FileWriter;
import java.io.IOException;

public class SaveAsThread extends Thread {

    private final int index;
    private final int[] array;

    public SaveAsThread(int index, int[] array) {
        this.index = index;
        this.array = array;
    }

    @Override
    public void run() {
        try (FileWriter w = new FileWriter("output/array" + index + ".txt")) {
            StringBuilder builder = new StringBuilder();
            for (int i : array) {
                builder.append(i);
                builder.append(", ");
            }
            w.write(builder.substring(0, builder.length() - 2));
            w.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}