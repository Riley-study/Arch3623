package Classes;

import Enumerators.TypeCar;
import Enumerators.TypeFuel;
import Enumerators.TypeGearBox;
import Interfaces.ICarWash;
import Interfaces.IFuelStation;

import java.awt.*;

public class Pickup extends Car implements IFuelStation, ICarWash {

    private int loadCap;

    public Pickup(String mark, String model, int numberWheels, TypeFuel fuelType,
                  TypeGearBox gearBox, Color bodyColor, int engineCap, int loadCap) {
        super(mark, model, TypeCar.PICKUP, numberWheels, fuelType, gearBox, bodyColor, engineCap);
        this.loadCap = loadCap;
    }

    @Override
    public void fuel() {

    }

    @Override
    public void wipWindowShield() {

    }

    @Override
    public void wipHeadLights() {

    }

    @Override
    public void wipMirrors() {

    }
}
