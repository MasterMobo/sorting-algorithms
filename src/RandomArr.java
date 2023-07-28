import java.util.Random;

public class RandomArr {
    public static int[] generate(int size, int min, int max) {
        int[] res = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            res[i] = random.nextInt(min, max);
        }

        return res;
    }

    public static int[] generate(int size, int max) {
        int[] res = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            res[i] = random.nextInt(max);
        }

        return res;
    }
}
