import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.ItemGenerator;
import Fabric.SilverGnerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class main {
    public static void main(String[] args) {
        ItemGenerator f1 = new GemGenerator();
        f1.openReward();
        ItemGenerator f2 = new GoldGenerator();
        f2.openReward();
        ItemGenerator f3 = new SilverGnerator();
        f3.openReward();
        List<ItemGenerator> itemGeneratorList = new ArrayList<>();
        itemGeneratorList.add(f1);
        itemGeneratorList.add(f2);
        itemGeneratorList.add(f3);

        Random rnd = ThreadLocalRandom.current();

        int gemCounter = 0;
        int goldCounter = 0;

        for (int i = 0; i < 20; i++) {
            // случайным образом достаем из списка сундучок и открываем его (10 раз)
            itemGeneratorList.get(rnd.nextInt(3)).openReward();

        }

    }
}
