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

        int gemCounter = 0;
        int goldCounter = 0;
        int maxCount = 30;
        int currentCount = 1;
        int currentIndex;
        ArrayList<Integer> listOfIndex = new ArrayList<>();

        while (currentCount < maxCount) {
            // случайным образом достаем из списка сундучок и формируем список, где нулевой элемент может встретиться
            // только один раз, а первый только три раза
            currentIndex = rnd.nextInt(8);


            if (currentIndex == 0 && gemCounter == 0) {
                gemCounter++;
                listOfIndex.add(currentIndex);
            }
            if (currentIndex == 0 && gemCounter > 0) {
                gemCounter++;
                currentCount--;
            }

            if (currentIndex == 1 && goldCounter < 3) {
                goldCounter++;
                listOfIndex.add(currentIndex);
            }
            if (currentIndex == 1 && goldCounter >= 3) {
                goldCounter++;
                currentCount--;
            }

            if (currentIndex > 1) {
                listOfIndex.add(currentIndex);
            }
            currentCount++;
        }


        for (int i = 0; i < listOfIndex.size(); i++) {
            itemGeneratorList.get(listOfIndex.get(i)).openReward();
        }
        // Для удобства проверки распечатаем индексы, видим, что генератор выдает золото и алмазы чаше, но в список
        // попадает не больше, чем 1 и 3 соответственно
        for (int i = 0; i < listOfIndex.size(); i++) {
            System.out.print(listOfIndex.get(i));
        }
        System.out.println("\n------------------------------");
        System.out.println("\n gemCounter =" + gemCounter);
        System.out.println("\n goldCounter =" + goldCounter);
        System.out.println("\n currentCount =" + currentCount);


    }

}
