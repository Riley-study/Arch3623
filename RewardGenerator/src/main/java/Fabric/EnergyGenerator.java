package Fabric;

import Interface.iGameItem;
import Product.BronzeReward;
import Product.EnergyReward;

public class EnergyGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new EnergyReward();
    }
}
