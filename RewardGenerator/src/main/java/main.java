import Fabric.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class main {
    public static void main(String[] args) {
        ItemGenerator f1 = new GemGenerator();
        ItemGenerator f2 = new GoldGenerator();
        ItemGenerator f3 = new SilverGnerator();
        ItemGenerator f4 = new BonusLifeGenerator();
        ItemGenerator f5 = new BronzeGenerator();
        ItemGenerator f6 = new FakeGenerator();
        ItemGenerator f7 = new EnergyGenerator();
        ItemGenerator f8 = new MalachiteGenerator();

        List<ItemGenerator> itemGeneratorList = new ArrayList<>();
        itemGeneratorList.add(f1);
        itemGeneratorList.add(f2);
        itemGeneratorList.add(f3);
        itemGeneratorList.add(f4);
        itemGeneratorList.add(f5);
        itemGeneratorList.add(f6);
        itemGeneratorList.add(f7);
        itemGeneratorList.add(f8);

        Random rnd = ThreadLocalRandom.current();
    }

}
