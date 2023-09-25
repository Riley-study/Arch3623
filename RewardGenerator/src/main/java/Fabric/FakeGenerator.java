package Fabric;

import Interface.iGameItem;
import Product.FakeReward;

public class FakeGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new FakeReward();
    }
}
