package Fabric;

import Interface.iGameItem;

public abstract class ItemGenerator {
    // прототип фабрики
    public abstract iGameItem createItem();
    public void openReward(){
        createItem().open();
    }
}
