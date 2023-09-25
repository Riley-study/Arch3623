package Fabric;

import Interface.iGameItem;
import Product.BonusLifeReward;
import Product.BronzeReward;

public class BonusLifeGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new BonusLifeReward();
    }
}
