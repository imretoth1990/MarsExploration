package mapgeneratortest.logic.random;

import java.util.Random;

public class RandomNumberGenerator {
    public int getAreaXAndY(int start, int end) {
        Random random = new Random();
        return random.nextInt(start, end);
    }

    public int getRandomNumber(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }
}
