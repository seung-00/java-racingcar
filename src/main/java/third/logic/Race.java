package third.logic;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.Random;

public class Race {

    private static final Random random = new Random();

    public static void startOneRace(ArrayList<Car> carList, int carCount) {
        IntStream.range(0, carCount).forEach(index -> carList.get(index).Move(getRandomNumber()));
    }

    public static int getRandomNumber() {
        return random.nextInt(9);
    }
}