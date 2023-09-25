package Fabric;

import Interface.iGameItem;
import Product.BronzeReward;
import Product.MalachiteReward;

public class MalachiteGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new MalachiteReward();
    }
}
