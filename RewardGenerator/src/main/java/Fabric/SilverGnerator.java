package Fabric;

import Interface.iGameItem;
import Product.SilverReward;

public class SilverGnerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new SilverReward();
    }
}
